package com.obagajesse.EcommercePriceChecker.Service.Impl;

import com.obagajesse.EcommercePriceChecker.DTO.PriceDTO;
import com.obagajesse.EcommercePriceChecker.Entities.Price;
import com.obagajesse.EcommercePriceChecker.Mapper.PriceMapper;
import com.obagajesse.EcommercePriceChecker.Repository.PriceRepository;
import com.obagajesse.EcommercePriceChecker.Repository.ProductRepository;
import com.obagajesse.EcommercePriceChecker.Service.PriceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class PriceServiceImpl implements PriceService {

    private final PriceRepository priceRepository;

    public PriceServiceImpl(PriceRepository priceRepository){
        this.priceRepository = priceRepository;
    }

    @Autowired
    private ProductRepository productRepository;

    @Override
    public PriceDTO createPrice(PriceDTO priceDTO){
        Price price = PriceMapper.mapToPrice(priceDTO);
        price.setDate(LocalDateTime.now());
        Price savedPrice = priceRepository.save(price);
        return PriceMapper.mapToPriceDTO(savedPrice);
    }

    @Override
    public PriceDTO updatePrice(PriceDTO priceDTO){
        Price price = PriceMapper.mapToPrice(priceDTO);
        Price updatedPrice = priceRepository.save(price);
        return PriceMapper.mapToPriceDTO(updatedPrice);
    }

    @Override
    public PriceDTO getPriceById(Long id){
        return priceRepository.findById(id).map(PriceMapper::mapToPriceDTO).orElse(null);
    }

    @Override
    public List<PriceDTO> getAllPrices(){
        List<Price> prices = priceRepository.findAll();
        return prices.stream().map(PriceMapper::mapToPriceDTO).toList();
    }

    @Override
    public void deletePrice(Long id){
        priceRepository.deleteById(id);
    }
}
