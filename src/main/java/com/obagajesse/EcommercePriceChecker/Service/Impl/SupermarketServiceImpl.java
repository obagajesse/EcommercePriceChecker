package com.obagajesse.EcommercePriceChecker.Service.Impl;

import com.obagajesse.EcommercePriceChecker.DTO.SupermarketDTO;
import com.obagajesse.EcommercePriceChecker.Entities.Supermarket;
import com.obagajesse.EcommercePriceChecker.Mapper.SupermarketMapper;
import com.obagajesse.EcommercePriceChecker.Repository.SupermarketRepository;
import com.obagajesse.EcommercePriceChecker.Service.SupermarketService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SupermarketServiceImpl implements SupermarketService {

    private final SupermarketRepository supermarketRepository;

    public SupermarketServiceImpl(SupermarketRepository supermarketRepository){
        this.supermarketRepository = supermarketRepository;
    }

    @Override
    public SupermarketDTO createSupermarket(SupermarketDTO supermarketDTO){
        Supermarket supermarket = SupermarketMapper.mapToSupermarket(supermarketDTO);
        Supermarket savedSupermarket = this.supermarketRepository.save(supermarket);
        return SupermarketMapper.mapToSupermarketDTO(savedSupermarket);
    }

    @Override
    public List<SupermarketDTO> getAllSupermarkets(){
        List<Supermarket> supermarkets = this.supermarketRepository.findAll();
        return supermarkets.stream().map(SupermarketMapper::mapToSupermarketDTO).toList();
    }

    @Override
    public SupermarketDTO getSupermarketById(Long id){
        return supermarketRepository.findById(id).map(SupermarketMapper::mapToSupermarketDTO).orElse(null);
    }

    @Override
    public SupermarketDTO updateSupermarket(SupermarketDTO supermarketDTO){
        Supermarket supermarket = SupermarketMapper.mapToSupermarket(supermarketDTO);
        Supermarket updatedSupermarket = this.supermarketRepository.save(supermarket);
        return SupermarketMapper.mapToSupermarketDTO(updatedSupermarket);
    }

    public void deleteSupermarket(Long id){
        supermarketRepository.deleteById(id);
    }
}
