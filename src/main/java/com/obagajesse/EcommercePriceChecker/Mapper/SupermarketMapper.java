package com.obagajesse.EcommercePriceChecker.Mapper;

import com.obagajesse.EcommercePriceChecker.DTO.SupermarketDTO;
import com.obagajesse.EcommercePriceChecker.Entities.Supermarket;

public class SupermarketMapper {

    public static Supermarket mapToSupermarket(SupermarketDTO supermarketDTO){
        return new Supermarket(
                supermarketDTO.getId(),
                supermarketDTO.getName(),
                supermarketDTO.getLocation(),
                supermarketDTO.getContactNumber(),
                supermarketDTO.getEmail(),
                supermarketDTO.getWebsiteUrl()
        );
    }

    public static SupermarketDTO mapToSupermarketDTO(Supermarket supermarket){
        return new SupermarketDTO(
                supermarket.getId(),
                supermarket.getName(),
                supermarket.getLocation(),
                supermarket.getContactNumber(),
                supermarket.getEmail(),
                supermarket.getWebsiteUrl()
        );
    }
}
