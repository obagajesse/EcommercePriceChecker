package com.obagajesse.EcommercePriceChecker.Service.Impl;

import com.obagajesse.EcommercePriceChecker.DTO.ProductOnlinePriceDTO;
import com.obagajesse.EcommercePriceChecker.Entities.ProductOnlinePrice;
import com.obagajesse.EcommercePriceChecker.Mapper.ProductOnlinePriceMapper;
import com.obagajesse.EcommercePriceChecker.Repository.ProductOnlinePriceRepository;
import com.obagajesse.EcommercePriceChecker.Service.ProductOnlinePriceService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductOnlinePriceServiceImpl implements ProductOnlinePriceService {

    private final ProductOnlinePriceRepository productOnlinePriceRepository;

    public ProductOnlinePriceServiceImpl(ProductOnlinePriceRepository productOnlinePriceRepository){
        this.productOnlinePriceRepository = productOnlinePriceRepository;
    }

    @Override
    public ProductOnlinePriceDTO createProductOnlinePrice(ProductOnlinePriceDTO productOnlinePriceDTO){
        ProductOnlinePrice productOnlinePrice = ProductOnlinePriceMapper.mapToProductOnlinePrice(productOnlinePriceDTO);
        ProductOnlinePrice savedProductOnlinePrice = productOnlinePriceRepository.save(productOnlinePrice);
        return ProductOnlinePriceMapper.mapToProductOnlinePriceDTO(savedProductOnlinePrice);
    }

    @Override
    public ProductOnlinePriceDTO getProductOnlinePriceById(Long id){
        return productOnlinePriceRepository.findById(id).map(ProductOnlinePriceMapper::mapToProductOnlinePriceDTO).orElse(null);
    }

    @Override
    public List<ProductOnlinePriceDTO> getAllProductOnlinePrices(){
        List<ProductOnlinePrice> productOnlinePrices = productOnlinePriceRepository.findAll();
        return productOnlinePrices.stream().map(ProductOnlinePriceMapper::mapToProductOnlinePriceDTO).toList();
    }

    @Override
    public void deleteProductOnlinePriceById(Long id){
        productOnlinePriceRepository.deleteById(id);
    }
}
