package com.obagajesse.EcommercePriceChecker.Repository;

import com.obagajesse.EcommercePriceChecker.Entities.ProductPrice;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductPriceRepository extends JpaRepository<ProductPrice,Long> {
}
