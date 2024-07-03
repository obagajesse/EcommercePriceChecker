package com.obagajesse.EcommercePriceChecker.Mapper;

import com.obagajesse.EcommercePriceChecker.DTO.OnlineShopDTO;
import com.obagajesse.EcommercePriceChecker.Entities.OnlineShop;

public class OnlineShopMapper {

    public static OnlineShop mapToOnlineShop(OnlineShopDTO onlineShopDTO){
        return new OnlineShop(
                onlineShopDTO.getId(),
                onlineShopDTO.getName(),
                onlineShopDTO.getWebsite(),
                onlineShopDTO.getContactNumber(),
                onlineShopDTO.getEmail()
        );
    }

    public static OnlineShopDTO mapToOnlineShopDTO(OnlineShop onlineShop){
        return new OnlineShopDTO(
                onlineShop.getId(),
                onlineShop.getName(),
                onlineShop.getWebsite(),
                onlineShop.getContactNumber(),
                onlineShop.getEmail()
        );
    }
}
