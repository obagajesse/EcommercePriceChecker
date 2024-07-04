package com.obagajesse.EcommercePriceChecker.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "product_price")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ProductPrice {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "productId",nullable = false)
    private Product product;

    @ManyToOne
    @JoinColumn(name = "supermarketId",nullable = false)
    private Supermarket supermarket;

    @Column(nullable = false)
    private Double price;

    public ProductPrice(Long id, Long productId, Long supermarketId, Double price) {
    }

//    public ProductPrice(Long id, Long productId, Long supermarketId, Double price) {
//    }
}
