package com.obagajesse.EcommercePriceChecker.Controllers;

import com.obagajesse.EcommercePriceChecker.DTO.ProductOnlinePriceDTO;
import com.obagajesse.EcommercePriceChecker.Service.ProductOnlinePriceService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/online-price")
public class ProductOnlinePriceController {

    private final ProductOnlinePriceService productOnlinePriceService;

    public ProductOnlinePriceController(ProductOnlinePriceService productOnlinePriceService){
        this.productOnlinePriceService = productOnlinePriceService;
    }

    @GetMapping
    public ResponseEntity<List<ProductOnlinePriceDTO>> getAllProductsOnlinePrice(){
        List<ProductOnlinePriceDTO> productOnlinePriceDTOS = productOnlinePriceService.getAllProductOnlinePrices();
        return ResponseEntity.ok(productOnlinePriceDTOS);
    }

    @GetMapping("/{id}")
    public ResponseEntity<ProductOnlinePriceDTO> getProductOnlinePriceById(@PathVariable Long id){
        ProductOnlinePriceDTO productOnlinePriceDTO = productOnlinePriceService.getProductOnlinePriceById(id);
        return ResponseEntity.ok(productOnlinePriceDTO);
    }

    @PostMapping
    public ResponseEntity<ProductOnlinePriceDTO> createProductOnlinePrice(@RequestBody ProductOnlinePriceDTO productOnlinePriceDTO){
        return new ResponseEntity<>(productOnlinePriceService.createProductOnlinePrice(productOnlinePriceDTO), HttpStatus.CREATED);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<ProductOnlinePriceDTO> deleteProductOnlinePriceById(@PathVariable Long id){
        productOnlinePriceService.deleteProductOnlinePriceById(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
