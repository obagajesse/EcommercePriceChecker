package com.obagajesse.EcommercePriceChecker.Service;

import com.obagajesse.EcommercePriceChecker.DTO.ProductPriceDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ProductPriceService {

    ProductPriceDTO createProductPrice(ProductPriceDTO productPriceDTO);

    ProductPriceDTO getProductPriceById(Long id);

    List<ProductPriceDTO> getAllProductPrices();

    void deleteProductPriceById(Long id);
}
