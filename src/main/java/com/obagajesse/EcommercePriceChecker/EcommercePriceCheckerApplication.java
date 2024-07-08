package com.obagajesse.EcommercePriceChecker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class EcommercePriceCheckerApplication {

	public static void main(String[] args) {
		SpringApplication.run(EcommercePriceCheckerApplication.class, args);
	}

}
