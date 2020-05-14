package com.kai.shoppingmall.service;

import com.kai.shoppingmall.entity.DiscountCouponHolder;
import com.kai.shoppingmall.response.BaseResponse;

public interface IDiscountCouponHolderService {
    BaseResponse findAll();

    BaseResponse insert(DiscountCouponHolder discountCouponHolder);

    BaseResponse select(Integer id);

    BaseResponse update(DiscountCouponHolder discountCouponHolder);

    BaseResponse delete(Integer id);
}
