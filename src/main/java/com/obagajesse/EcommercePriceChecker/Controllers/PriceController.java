package com.obagajesse.EcommercePriceChecker.Controllers;

import com.obagajesse.EcommercePriceChecker.Service.Impl.PriceAggregatorService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class PriceController {

    private final PriceAggregatorService priceAggregatorService;

    public PriceController(PriceAggregatorService priceAggregatorService) {
        this.priceAggregatorService = priceAggregatorService;
    }

    public ResponseEntity<Map<String, Map<String,Double>>> webScrapeServices(@RequestParam String productName) {
        Map<String,Map<String,Double>> prices = priceAggregatorService.getPrices(productName);
        return ResponseEntity.ok(prices);
    }
}
