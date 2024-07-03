package com.obagajesse.EcommercePriceChecker.Service;

import com.obagajesse.EcommercePriceChecker.DTO.SupermarketDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface SupermarketService {

    SupermarketDTO createSupermarket(SupermarketDTO supermarketDTO);

    SupermarketDTO updateSupermarket(SupermarketDTO supermarketDTO);

    SupermarketDTO getSupermarketById(Long id);

    List<SupermarketDTO> getAllSupermarkets();

    void deleteSupermarket(Long id);
}
