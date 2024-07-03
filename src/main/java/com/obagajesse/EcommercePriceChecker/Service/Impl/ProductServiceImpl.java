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
    public  ProductDTO createProduct(ProductDTO productDTO){
        Product product = ProductMapper.mapToProduct(productDTO);
//        product.setBarcode(UUID.randomUUID().toString());
//        product.setSku(UUID.randomUUID().toString());
        Product savedProduct = productRepository.save(product);
        return ProductMapper.mapToProductDTO(savedProduct);
    }

    @Override
    public List<ProductDTO> getAllProducts(){
        List<Product> products = productRepository.findAll();
        return products.stream().map(ProductMapper::mapToProductDTO).toList();
    }

    @Override
    public ProductDTO getProductById(Long id){
        return productRepository.findById(id).map(ProductMapper::mapToProductDTO).orElse(null);
    }

    @Override
    public ProductDTO updateProduct(ProductDTO productDTO){
        Product product = ProductMapper.mapToProduct(productDTO);
        Product updatedProduct = productRepository.save(product);
        return ProductMapper.mapToProductDTO(updatedProduct);
    }

    @Override
    public void deleteProduct(Long id){
        productRepository.deleteById(id);
    }
}
