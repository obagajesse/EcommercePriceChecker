package com.obagajesse.EcommercePriceChecker.Service;

import com.obagajesse.EcommercePriceChecker.DTO.ProductOnlinePriceDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ProductOnlinePriceService {

    ProductOnlinePriceDTO createProductOnlinePrice(ProductOnlinePriceDTO productOnlinePriceDTO);

    ProductOnlinePriceDTO getProductOnlinePriceById(Long id);

    List<ProductOnlinePriceDTO> getAllProductOnlinePrices();

    void deleteProductOnlinePriceById(Long id);
}
