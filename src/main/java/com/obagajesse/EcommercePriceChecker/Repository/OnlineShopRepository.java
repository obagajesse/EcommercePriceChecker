package com.obagajesse.EcommercePriceChecker.Repository;

import com.obagajesse.EcommercePriceChecker.Entities.OnlineShop;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OnlineShopRepository extends JpaRepository<OnlineShop,Long> {
}
