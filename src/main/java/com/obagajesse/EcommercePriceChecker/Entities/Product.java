package com.obagajesse.EcommercePriceChecker.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
import java.util.Objects;

@Entity
@Table(name = "Products")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Product  {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String brand;

    @Column(nullable = false)
    private String description;

    @Column(nullable = false)
    private String category;

    @Column(nullable = false,unique = true)
    private String sku;

    @Column(nullable = false,unique = true)
    private String barcode;

    @Column(nullable = false)
    private String size;

    @Column(nullable = false)
    private String color;

    @Column(nullable = false)
    private String imageUrl;

    @Column(nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
//    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date dateAdded;

    @Column(nullable = false)
    private boolean active;
    


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return active == product.active && Objects.equals(id, product.id) && Objects.equals(name, product.name) && Objects.equals(brand, product.brand) && Objects.equals(description, product.description) && Objects.equals(category, product.category) && Objects.equals(sku, product.sku) && Objects.equals(barcode, product.barcode) && Objects.equals(size, product.size) && Objects.equals(color, product.color) && Objects.equals(imageUrl, product.imageUrl) && Objects.equals(dateAdded, product.dateAdded);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, brand, description, category, sku, barcode, size, color, imageUrl, dateAdded, active);
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", brand='" + brand + '\'' +
                ", description='" + description + '\'' +
                ", category='" + category + '\'' +
                ", sku='" + sku + '\'' +
                ", barcode='" + barcode + '\'' +
                ", size='" + size + '\'' +
                ", color='" + color + '\'' +
                ", imageUrl='" + imageUrl + '\'' +
                ", dateAdded=" + dateAdded +
                ", active=" + active +
                '}';
    }
}
