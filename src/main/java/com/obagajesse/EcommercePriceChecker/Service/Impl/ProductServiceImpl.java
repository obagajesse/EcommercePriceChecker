package com.obagajesse.EcommercePriceChecker.Service.Impl;

import com.obagajesse.EcommercePriceChecker.DTO.ProductDTO;
import com.obagajesse.EcommercePriceChecker.Entities.Product;
import com.obagajesse.EcommercePriceChecker.Mapper.ProductMapper;
import com.obagajesse.EcommercePriceChecker.Repository.ProductRepository;
import com.obagajesse.EcommercePriceChecker.Service.ProductService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class ProductServiceImpl implements ProductService {

    private final ProductRepository productRepository;

    public ProductServiceImpl(ProductRepository productRepository){
        this.productRepository = productRepository;
    }

    @Override
    public Product createProduct(ProductDTO productDTO){
        Product product = ProductMapper.mapToProduct(productDTO);
        product.setSku(UUID.randomUUID().toString());
        product.setBarcode(UUID.randomUUID().toString());
        Product savedProduct = productRepository.save(product);
        return ProductMapper.mapToProductDTO(savedProduct);
    }

   @Override
   public List<Product> getAllProducts(){
        List<Product> products = productRepository.findAll();
        return products.stream().map(ProductMapper::mapToProductDTO).toList();
   }

   @Override
    public Product getProductById(Long id){
        return productRepository.findById(id).map(ProductMapper::mapToProductDTO).orElseThrow(() -> new RuntimeException("Product not found"));
   }

   @Override
    public void deleteProduct(Long id){
        productRepository.deleteById(id);
   }
}
