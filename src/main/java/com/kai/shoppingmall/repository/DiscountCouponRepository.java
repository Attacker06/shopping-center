package com.kai.shoppingmall.repository;

import com.kai.shoppingmall.entity.DiscountCoupon;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DiscountCouponRepository extends JpaRepository<DiscountCoupon,Integer> {
}
