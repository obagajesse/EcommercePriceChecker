package com.obagajesse.EcommercePriceChecker.Repository;

import com.obagajesse.EcommercePriceChecker.Entities.ProductOnlinePrice;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductOnlinePriceRepository extends JpaRepository<ProductOnlinePrice,Long> {
}
