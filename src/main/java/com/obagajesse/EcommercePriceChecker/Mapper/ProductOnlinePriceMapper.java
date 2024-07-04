package com.obagajesse.EcommercePriceChecker.Mapper;

import com.obagajesse.EcommercePriceChecker.DTO.ProductOnlinePriceDTO;
import com.obagajesse.EcommercePriceChecker.Entities.ProductOnlinePrice;

public class ProductOnlinePriceMapper {

    public static ProductOnlinePrice mapToProductOnlinePrice(ProductOnlinePriceDTO productOnlinePriceDTO){
        return new ProductOnlinePrice(
                productOnlinePriceDTO.getId(),
                productOnlinePriceDTO.getProductId(),
                productOnlinePriceDTO.getOnlineShopId(),
                productOnlinePriceDTO.getPrice()
        );
    }

    public static ProductOnlinePriceDTO mapToProductOnlinePriceDTO(ProductOnlinePrice productOnlinePrice){
        return new ProductOnlinePriceDTO(
                productOnlinePrice.getId(),
                productOnlinePrice.getProduct().getId(),
                productOnlinePrice.getOnlineShop().getId(),
                productOnlinePrice.getPrice()
        );
    }
}
