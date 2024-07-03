package com.obagajesse.EcommercePriceChecker.Service;

import com.obagajesse.EcommercePriceChecker.DTO.OnlineShopDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface OnlineShopService {

    OnlineShopDTO createOnlineShop(OnlineShopDTO onlineShopDTO);

    OnlineShopDTO updateOnlineShop(OnlineShopDTO onlineShopDTO);

    OnlineShopDTO getOnlineShopById(Long id);

    List<OnlineShopDTO> getAllOnlineShops();

    void deleteOnlineShop(Long id);
}
