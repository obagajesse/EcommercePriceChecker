package com.obagajesse.EcommercePriceChecker.Service;

import com.obagajesse.EcommercePriceChecker.DTO.ProductDTO;
import com.obagajesse.EcommercePriceChecker.Entities.Product;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ProductService {

    Product createProduct(ProductDTO productDTO);

    Product getProductById(Long id);

    List<Product> getAllProducts();

    void deleteProduct(Long id);
}
