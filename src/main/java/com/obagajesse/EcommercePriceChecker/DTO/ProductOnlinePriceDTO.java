package com.obagajesse.EcommercePriceChecker.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductOnlinePriceDTO {

    private Long id;
    private Long productId;
    private Long onlineShopId;
    private Double price;
}