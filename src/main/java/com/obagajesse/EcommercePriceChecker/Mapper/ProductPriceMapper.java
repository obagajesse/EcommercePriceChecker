package com.obagajesse.EcommercePriceChecker.Mapper;

import com.obagajesse.EcommercePriceChecker.DTO.ProductPriceDTO;
import com.obagajesse.EcommercePriceChecker.Entities.ProductPrice;

public class ProductPriceMapper {

    public static ProductPrice mapToProductPrice(ProductPriceDTO productPriceDTO){
        return new ProductPrice(
                productPriceDTO.getId(),
                productPriceDTO.getProductId(),
                productPriceDTO.getSupermarketId(),
                productPriceDTO.getPrice()
        );
    }

    public static ProductPriceDTO mapToProductPriceDTO(ProductPrice productPrice){
        return new ProductPriceDTO(
                productPrice.getId(),
                productPrice.getProduct().getId(),
                productPrice.getSupermarket().getId(),
                productPrice.getPrice()
        );
    }
}
