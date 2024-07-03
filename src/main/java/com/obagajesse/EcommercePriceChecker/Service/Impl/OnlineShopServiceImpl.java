package com.obagajesse.EcommercePriceChecker.Service.Impl;

import com.obagajesse.EcommercePriceChecker.DTO.OnlineShopDTO;
import com.obagajesse.EcommercePriceChecker.Entities.OnlineShop;
import com.obagajesse.EcommercePriceChecker.Mapper.OnlineShopMapper;
import com.obagajesse.EcommercePriceChecker.Repository.OnlineShopRepository;
import com.obagajesse.EcommercePriceChecker.Service.OnlineShopService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OnlineShopServiceImpl implements OnlineShopService {

    private final OnlineShopRepository onlineShopRepository;

    public OnlineShopServiceImpl(OnlineShopRepository onlineShopRepository){
        this.onlineShopRepository = onlineShopRepository;
    }

    @Override
    public OnlineShopDTO createOnlineShop(OnlineShopDTO onlineShopDTO){
        OnlineShop onlineShop = OnlineShopMapper.mapToOnlineShop(onlineShopDTO);
        OnlineShop savedOnlineShop = onlineShopRepository.save(onlineShop);
        return OnlineShopMapper.mapToOnlineShopDTO(savedOnlineShop);
    }

    @Override
    public List<OnlineShopDTO> getAllOnlineShops(){
        List<OnlineShop> onlineShops = onlineShopRepository.findAll();
        return onlineShops.stream().map(OnlineShopMapper::mapToOnlineShopDTO).toList();
    }

    @Override
    public OnlineShopDTO getOnlineShopById(Long id){
        return onlineShopRepository.findById(id).map(OnlineShopMapper::mapToOnlineShopDTO).orElse(null);
    }

    @Override
    public OnlineShopDTO updateOnlineShop(OnlineShopDTO onlineShopDTO){
        OnlineShop onlineShop = OnlineShopMapper.mapToOnlineShop(onlineShopDTO);
        OnlineShop updatedOnlineShop = onlineShopRepository.save(onlineShop);
        return OnlineShopMapper.mapToOnlineShopDTO(updatedOnlineShop);
    }

    @Override
    public void deleteOnlineShop(Long id){
        onlineShopRepository.deleteById(id);
    }
}
