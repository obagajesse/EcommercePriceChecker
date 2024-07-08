package com.obagajesse.EcommercePriceChecker.Service.Impl;

import com.obagajesse.EcommercePriceChecker.Service.WebScrapperService;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class PriceAggregatorService {

    private final List<WebScrapperService> webScrapperServices;

    public PriceAggregatorService(List<WebScrapperService> webScrapperServices) {
        this.webScrapperServices = webScrapperServices;
    }

    public Map<String, Map<String,Double>> getPrices(String productName){
        Map<String,Map<String,Double>> allPrices = new HashMap<>();
        for (WebScrapperService webScrapperService : webScrapperServices) {
            Map<String,Double> prices = webScrapperService.scrapePrices(productName);
            allPrices.put(webScrapperService.getClass().getSimpleName(),prices);
        }

        return allPrices;
    }
}
