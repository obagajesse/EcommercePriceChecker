package com.obagajesse.EcommercePriceChecker.Controllers;

import com.obagajesse.EcommercePriceChecker.DTO.SupermarketDTO;
import com.obagajesse.EcommercePriceChecker.Service.SupermarketService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/supermarkets")
public class SupermarketController {

    private final SupermarketService supermarketService;

    public SupermarketController(SupermarketService supermarketService){
        this.supermarketService = supermarketService;
    }

    @GetMapping
    public ResponseEntity<List<SupermarketDTO>> getAllSupermarkets(){
        List<SupermarketDTO> supermarkets = supermarketService.getAllSupermarkets();
        return ResponseEntity.ok(supermarkets);
    }

    @GetMapping("/{id}")
    public ResponseEntity<SupermarketDTO> getSupermarketById(@PathVariable Long id){
        SupermarketDTO supermarketDTO = supermarketService.getSupermarketById(id);
        return ResponseEntity.ok(supermarketDTO);
    }

    @PostMapping
    public ResponseEntity<SupermarketDTO> createSupermarket(@RequestBody SupermarketDTO supermarketDTO){
        return new ResponseEntity<>(supermarketService.createSupermarket(supermarketDTO), HttpStatus.CREATED);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<SupermarketDTO> deleteSupermarket(@PathVariable Long id){
        supermarketService.deleteSupermarket(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
