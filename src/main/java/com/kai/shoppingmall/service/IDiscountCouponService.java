package com.kai.shoppingmall.service;

import com.kai.shoppingmall.entity.DiscountCoupon;
import com.kai.shoppingmall.response.BaseResponse;
import java.util.Date;

public interface IDiscountCouponService {
    BaseResponse findAll();

    BaseResponse select(Integer id);

    BaseResponse insert(DiscountCoupon discountCoupon);

    BaseResponse update(DiscountCoupon discountCoupon);

    BaseResponse delete(Integer id);

    BaseResponse addCoupon(DiscountCoupon discountCoupon);

    BaseResponse addCouponWithAmount(Date expireDate,Double amount,Double percentOff);
}
