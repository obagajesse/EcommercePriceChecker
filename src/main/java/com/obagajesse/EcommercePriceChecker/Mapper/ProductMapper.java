package com.obagajesse.EcommercePriceChecker.Mapper;

import com.obagajesse.EcommercePriceChecker.DTO.ProductDTO;
import com.obagajesse.EcommercePriceChecker.Entities.Product;

public class ProductMapper {

    public static Product mapToProduct(ProductDTO productDTO){
        return new Product(
                productDTO.getId(),
                productDTO.getName(),
                productDTO.getBrand(),
                productDTO.getDescription(),
                productDTO.getCategory(),
                productDTO.getSku(),
                productDTO.getSize(),
                productDTO.getColor(),
                productDTO.getImageUrl()
        );
    }

    public static ProductDTO mapToProductDTO(Product product){
        return new ProductDTO(
                product.getId(),
                product.getName(),
                product.getBrand(),
                product.getDescription(),
                product.getCategory(),
                product.getSku(),
                product.getBarcode(),
                product.getSize(),
                product.getColor(),
                product.getImageUrl()
        );
    }
}
