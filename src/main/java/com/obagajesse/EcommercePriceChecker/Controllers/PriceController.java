package com.obagajesse.EcommercePriceChecker.Controllers;

import com.obagajesse.EcommercePriceChecker.DTO.PriceDTO;
import com.obagajesse.EcommercePriceChecker.Service.PriceService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/price")
public class PriceController {

    private final PriceService priceService;

    public PriceController(PriceService priceService){
        this.priceService = priceService;
    }

    @GetMapping
    public ResponseEntity<List<PriceDTO>> getAllPrices(){
        List<PriceDTO> prices = this.priceService.getAllPrices();
        return ResponseEntity.ok(prices);
    }

    @GetMapping("/{id}")
    public ResponseEntity<PriceDTO> getPriceById(@PathVariable Long id){
        PriceDTO priceDTO = priceService.getPriceById(id);
        return ResponseEntity.ok(priceDTO);
    }

    @PostMapping
    public ResponseEntity<PriceDTO> createPrice(@RequestBody PriceDTO priceDTO){
        return new ResponseEntity<>(priceService.createPrice(priceDTO), HttpStatus.CREATED);
    }

//    @PutMapping("/{id}update")
//    public ResponseEntity<PriceDTO> updatePrice(@PathVariable Long id){
//        PriceDTO priceDTO1 = priceService.updatePrice(id);
//        return ResponseEntity.ok(priceDTO1);
//    }

    @DeleteMapping("/{id}")
    public ResponseEntity<PriceDTO> deletePrice(@PathVariable Long id){
        priceService.deletePrice(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
