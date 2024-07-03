package com.obagajesse.EcommercePriceChecker.DTO;

import com.obagajesse.EcommercePriceChecker.Entities.OnlineShop;
import com.obagajesse.EcommercePriceChecker.Entities.Product;
import com.obagajesse.EcommercePriceChecker.Entities.Supermarket;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PriceDTO {

    private Long id;
    private Long product_id;
    private Long supermarket_id;
    private Long onlineshop_id;
    private Double price;
    private LocalDateTime date;


    public PriceDTO(Long id, Product product, Supermarket supermarket, OnlineShop onlineShop, double price, LocalDateTime date) {
        this.id = id;
        this.product_id = product.getId();
        this.supermarket_id = supermarket.getId();
        this.onlineshop_id = onlineShop.getId();
        this.price = price;
        this.date = date;
    }
}
