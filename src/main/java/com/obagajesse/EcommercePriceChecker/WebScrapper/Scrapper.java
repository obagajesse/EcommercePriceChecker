package com.obagajesse.EcommercePriceChecker.WebScrapper;

import java.net.URI;
import java.util.List;

public record Scrapper(URI url, String title, List<String>keywords,List<String>links) {
}
