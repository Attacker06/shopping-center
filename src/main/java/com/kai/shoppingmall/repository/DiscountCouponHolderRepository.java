package com.kai.shoppingmall.repository;

import com.kai.shoppingmall.entity.DiscountCouponHolder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DiscountCouponHolderRepository extends JpaRepository<DiscountCouponHolder,Integer> {
}