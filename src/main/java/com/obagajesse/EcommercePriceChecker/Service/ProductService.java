package com.obagajesse.EcommercePriceChecker.Service;

import com.obagajesse.EcommercePriceChecker.DTO.ProductDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ProductService {

    ProductDTO createProduct(ProductDTO productDTO);

    ProductDTO updateProduct(ProductDTO productDTO);

    ProductDTO getProductById(Long id);

    List<ProductDTO> getAllProducts();

    void deleteProduct(Long id);
}
