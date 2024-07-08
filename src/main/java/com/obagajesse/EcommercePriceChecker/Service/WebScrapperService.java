package com.obagajesse.EcommercePriceChecker.Service;

import org.springframework.boot.autoconfigure.mail.MailProperties;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public interface WebScrapperService {

    Map<String,Double> scrapePrices(String productName);
}
