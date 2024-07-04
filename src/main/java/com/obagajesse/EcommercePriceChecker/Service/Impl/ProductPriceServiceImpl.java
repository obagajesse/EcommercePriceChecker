package com.obagajesse.EcommercePriceChecker.Service.Impl;

import com.obagajesse.EcommercePriceChecker.DTO.ProductPriceDTO;
import com.obagajesse.EcommercePriceChecker.Entities.ProductPrice;
import com.obagajesse.EcommercePriceChecker.Mapper.ProductMapper;
import com.obagajesse.EcommercePriceChecker.Mapper.ProductPriceMapper;
import com.obagajesse.EcommercePriceChecker.Repository.ProductPriceRepository;
import com.obagajesse.EcommercePriceChecker.Service.ProductPriceService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductPriceServiceImpl implements ProductPriceService {

    private final ProductPriceRepository productPriceRepository;

    public ProductPriceServiceImpl(ProductPriceRepository productPriceRepository){
        this.productPriceRepository = productPriceRepository;
    }

    @Override
    public ProductPriceDTO createProductPrice(ProductPriceDTO productPriceDTO){
        ProductPrice productPrice = ProductPriceMapper.mapToProductPrice(productPriceDTO);
        ProductPrice savedProductPrice = productPriceRepository.save(productPrice);
        return ProductPriceMapper.mapToProductPriceDTO(savedProductPrice);
    }

    @Override
    public ProductPriceDTO getProductPriceById(Long id){
        return productPriceRepository.findById(id).map(ProductPriceMapper::mapToProductPriceDTO).orElse(null);
    }

    @Override
    public List<ProductPriceDTO> getAllProductPrices(){
        List<ProductPrice> productPrices = productPriceRepository.findAll();
        return productPrices.stream().map(ProductPriceMapper::mapToProductPriceDTO).toList();
    }

    @Override
    public void deleteProductPriceById(Long id){
        productPriceRepository.deleteById(id);
    }
}
