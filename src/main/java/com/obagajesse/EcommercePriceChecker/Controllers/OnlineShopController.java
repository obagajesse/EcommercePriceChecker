package com.obagajesse.EcommercePriceChecker.Controllers;

import com.obagajesse.EcommercePriceChecker.DTO.OnlineShopDTO;
import com.obagajesse.EcommercePriceChecker.Service.OnlineShopService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/shop")
public class OnlineShopController {

    private final OnlineShopService onlineShopService;

    public OnlineShopController(OnlineShopService onlineShopService){
        this.onlineShopService = onlineShopService;
    }

    @GetMapping
    public ResponseEntity<List<OnlineShopDTO>> getAllOnlineShops(){
        List<OnlineShopDTO> onlineShops = onlineShopService.getAllOnlineShops();
        return ResponseEntity.ok(onlineShops);
    }

    @GetMapping("/{id}")
    public ResponseEntity<OnlineShopDTO> getOnlineShopById(@PathVariable Long id){
        OnlineShopDTO onlineShopDTO = onlineShopService.getOnlineShopById(id);
        return ResponseEntity.ok(onlineShopDTO);
    }

    @PostMapping
    public ResponseEntity<OnlineShopDTO> createOnlineShop(@RequestBody OnlineShopDTO onlineShopDTO){
        return new ResponseEntity<>(onlineShopService.createOnlineShop(onlineShopDTO), HttpStatus.CREATED);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<OnlineShopDTO> deleteOnlineShopById(@PathVariable Long id){
        onlineShopService.deleteOnlineShop(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
