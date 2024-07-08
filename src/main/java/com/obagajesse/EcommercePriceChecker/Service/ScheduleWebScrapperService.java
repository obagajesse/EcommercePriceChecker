package com.obagajesse.EcommercePriceChecker.Service;

import com.obagajesse.EcommercePriceChecker.Service.Impl.PriceAggregatorService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class ScheduleWebScrapperService {

    private final PriceAggregatorService priceAggregatorService;

    public ScheduleWebScrapperService(PriceAggregatorService priceAggregatorService) {
        this.priceAggregatorService = priceAggregatorService;
    }

    public void scrapedPricesScheduled(){
        List<String> productNames = List.of("Phones","Tablets","Appliances");

        for(String productName : productNames) {
            Map<String,Map<String,Double>> prices = priceAggregatorService.getPrices(productName);

            System.out.println("Scrapped prices for: " + productName + ":" + prices);
        }
    }
}
