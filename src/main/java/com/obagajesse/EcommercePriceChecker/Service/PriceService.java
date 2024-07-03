package com.obagajesse.EcommercePriceChecker.Service;

import com.obagajesse.EcommercePriceChecker.DTO.PriceDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface PriceService {

    PriceDTO createPrice(PriceDTO priceDTO);

//    PriceDTO createPrice(PriceDTO priceDTO);

    PriceDTO updatePrice(PriceDTO priceDTO);

    PriceDTO getPriceById(Long id);

    List<PriceDTO> getAllPrices();

    void deletePrice(Long id);
}
