package com.obagajesse.EcommercePriceChecker.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PriceDTO {

    private Long id;
    private Long product_id;
    private Long supermarket_id;
    private Long onlineshop_id;
    private Double price;
}
