package com.obagajesse.EcommercePriceChecker.WebScrapper;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.springframework.http.client.SimpleClientHttpRequestFactory;
import org.springframework.web.client.RestClient;
import org.springframework.web.client.RestTemplate;

import java.net.HttpURLConnection;
import java.net.URI;
import java.util.Optional;

public class WebScrapper {

    RestClient restClient = createRestClient();

    private static RestClient createRestClient(){
        return RestClient.create(new RestTemplate(simpleClientHttpRequestFactory()));
    }

    private static SimpleClientHttpRequestFactory simpleClientHttpRequestFactory(){
        return new SimpleClientHttpRequestFactory(){
            @Override
            protected void prepareConnection(HttpURLConnection connection,String httpMethod){
                connection.setInstanceFollowRedirects(true);
            }
        };
    }

    private String downloadPage(String url){
        return restClient
                .get()
                .uri(url)
                .retrieve()
                .body(String.class);
    }

    private Document parse(String htmlContent){
        return Jsoup.parse(Optional.ofNullable(htmlContent).orElse("<body></body>"));
    }

    public Scrapper scrape(String url){
        Document document = parse(downloadPage(url));
        return new Scrapper(
                URI.create(url),
                document.title(),
                document.select("meta[name = keywords]").eachAttr("content"),
                document.selectXpath("//a[String-length(@href) > 0")
                        .stream()
                        .map(element -> getHref(url,element.attr("href")))
                        .toList()
        );
    }

    private static String getHref(String url,String href){
        if(!href.startsWith("http")){
            URI uri = URI.create(url);
            return uri.getScheme() + "://" + uri.getHost() + (!href.startsWith("/") ? "/":"") + href;
        }

        return href;
    }
}
