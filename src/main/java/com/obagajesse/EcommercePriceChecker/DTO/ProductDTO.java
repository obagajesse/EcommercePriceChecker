package com.obagajesse.EcommercePriceChecker.DTO;

import com.obagajesse.EcommercePriceChecker.Entities.Product;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductDTO extends Product {

    private Long id;
    private String name;
    private String brand;
    private String description;
    private String category;
    private String sku;
    private String barcode;
    private String size;
    private String color;
    private String imageUrl;
    private Date dateAdded;
    private boolean active;

    public ProductDTO(long id, String name, String brand, String description, String category, String sku, String barcode, String size, String color, String imageUrl, Date dateAdded) {
        this.id = id;
        this.name = name;
        this.brand = brand;
        this.description = description;
        this.category = category;
        this.sku = sku;
        this.barcode = barcode;
        this.size = size;
        this.color = color;
        this.imageUrl = imageUrl;
        this.dateAdded = dateAdded;
    }
}
