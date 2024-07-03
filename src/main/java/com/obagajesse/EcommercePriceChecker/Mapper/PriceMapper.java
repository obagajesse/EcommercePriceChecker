package com.obagajesse.EcommercePriceChecker.Mapper;

import com.obagajesse.EcommercePriceChecker.DTO.PriceDTO;
import com.obagajesse.EcommercePriceChecker.Entities.Price;

public class PriceMapper {

    public static Price mapToPrice(PriceDTO priceDTO){
        return new Price(
                priceDTO.getId(),
                priceDTO.getProduct_id(),
                priceDTO.getSupermarket_id(),
                priceDTO.getOnlineshop_id(),
                priceDTO.getPrice(),
                priceDTO.getDate()
        );
    }

    public static PriceDTO mapToPriceDTO(Price price){
        return new PriceDTO(
                price.getId(),
                price.getProduct(),
                price.getSupermarket(),
                price.getOnlineShop(),
                price.getPrice(),
                price.getDate()
        );
    }
}
