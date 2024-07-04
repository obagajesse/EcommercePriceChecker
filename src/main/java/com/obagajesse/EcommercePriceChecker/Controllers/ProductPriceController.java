package com.obagajesse.EcommercePriceChecker.Controllers;

import com.obagajesse.EcommercePriceChecker.DTO.ProductPriceDTO;
import com.obagajesse.EcommercePriceChecker.Service.ProductPriceService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/price")
public class ProductPriceController {

    private final ProductPriceService productPriceService;

    public ProductPriceController(ProductPriceService productPriceService){
        this.productPriceService = productPriceService;
    }

    @GetMapping
    public ResponseEntity<List<ProductPriceDTO>> getAllProductPrices(){
        List<ProductPriceDTO> productPrices = productPriceService.getAllProductPrices();
        return ResponseEntity.ok(productPrices);
    }

    @GetMapping("/{id}")
    public ResponseEntity<ProductPriceDTO> getProductPriceById(@PathVariable Long id){
        ProductPriceDTO productPriceDTO = productPriceService.getProductPriceById(id);
        return ResponseEntity.ok(productPriceDTO);
    }

    @PostMapping
    public ResponseEntity<ProductPriceDTO> createProductPrice(@RequestBody ProductPriceDTO productPriceDTO){
        return new ResponseEntity<>(productPriceService.createProductPrice(productPriceDTO), HttpStatus.CREATED);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<ProductPriceDTO> deleteProductPriceById(@PathVariable Long id){
        productPriceService.deleteProductPriceById(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
