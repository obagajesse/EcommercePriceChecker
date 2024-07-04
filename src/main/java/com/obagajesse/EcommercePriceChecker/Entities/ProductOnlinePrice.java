package com.obagajesse.EcommercePriceChecker.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "product_online_price")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ProductOnlinePrice {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "productId",nullable = false)
    private Product product;

    @ManyToOne
    @JoinColumn(name = "onlineShopId",nullable = false)
    private OnlineShop onlineShop;

    @Column(nullable = false)
    private Double price;
}
