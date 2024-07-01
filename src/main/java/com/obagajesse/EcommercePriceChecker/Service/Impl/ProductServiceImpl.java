package com.obagajesse.EcommercePriceChecker.Service.Impl;

import com.obagajesse.EcommercePriceChecker.DTO.ProductDTO;
import com.obagajesse.EcommercePriceChecker.Entities.Product;
import com.obagajesse.EcommercePriceChecker.Mapper.ProductMapper;
import com.obagajesse.EcommercePriceChecker.Repository.ProductRepository;
import com.obagajesse.EcommercePriceChecker.Service.ProductService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class ProductServiceImpl implements ProductService {

    private ProductRepository productRepository;

    public ProductServiceImpl(ProductRepository productRepository){
        this.productRepository = productRepository;
    }


    @Override
    public ProductDTO createProduct(ProductDTO productDTO) {
        Product product = (Product) ProductMapper.mapToProduct(productDTO);
        Product savedProduct = productRepository.save(product);
        return ProductMapper.mapToProductDTO(savedProduct);
    }

    @Override
    public List<Product> getAllProducts(){
        List<Product> products = productRepository.findAll();
        return products.stream().map(ProductMapper::mapToProductDTO).toList();
    }

    @Override
    public ProductDTO getProductById(Long id){
        return ProductMapper.mapToProductDTO(Objects.requireNonNull(productRepository.findById(id).orElse(null)));
    }


    @Override
    public void deleteProduct(Long id){
        productRepository.deleteById(id);
    }
}
