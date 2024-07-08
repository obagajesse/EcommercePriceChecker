package com.obagajesse.EcommercePriceChecker.Service.Impl;

import com.obagajesse.EcommercePriceChecker.Service.WebScrapperService;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.springframework.stereotype.Service;

import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;

@Service
public class JumiaWebScraperService implements WebScrapperService {

    @Override
    public Map<String,Double> scrapePrices(String productName){
        Map<String,Double> prices = new HashMap<>();
        try{
            String url = "https://www.jumia.co.ke/products/s?k=" + URLEncoder.encode(productName,"UTF-8");
            Document document = Jsoup.connect(url).get();
            Elements elements = document.select(".a-price-whole");
            for(Element element : elements){
                String priceText = element.text();
                double price = Double.parseDouble(priceText.replace(",",""));
                prices.put("Jumia",price);
            }
        }catch(Exception ex){
            ex.printStackTrace();
        }

        return prices;
    }
}
