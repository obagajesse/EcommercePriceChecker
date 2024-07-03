package com.obagajesse.EcommercePriceChecker.Repository;

import com.obagajesse.EcommercePriceChecker.Entities.Supermarket;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SupermarketRepository extends JpaRepository<Supermarket,Long> {
}
