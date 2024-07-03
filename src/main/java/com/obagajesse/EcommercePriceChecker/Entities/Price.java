package com.obagajesse.EcommercePriceChecker.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
import java.util.Objects;

@Entity
@Table(name = "price")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Price {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "product_id",nullable = false)
    private Product product;

    @ManyToOne
    @JoinColumn(name = "supermarket_id")
    private Supermarket supermarket;

    @ManyToOne
    @JoinColumn(name = "onlineshop_id")
    private OnlineShop onlineShop;

    @Column(nullable = false)
    private double price;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(nullable = false)
    private Date date;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Price price1 = (Price) o;
        return Double.compare(price, price1.price) == 0 && Objects.equals(id, price1.id) && Objects.equals(product, price1.product) && Objects.equals(supermarket, price1.supermarket) && Objects.equals(onlineShop, price1.onlineShop) && Objects.equals(date, price1.date);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, product, supermarket, onlineShop, price, date);
    }

    @Override
    public String toString() {
        return "Price{" +
                "id=" + id +
                ", product=" + product +
                ", supermarket=" + supermarket +
                ", onlineShop=" + onlineShop +
                ", price=" + price +
                ", date=" + date +
                '}';
    }
}
