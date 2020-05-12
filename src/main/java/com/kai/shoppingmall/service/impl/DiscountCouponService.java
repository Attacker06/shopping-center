package com.kai.shoppingmall.service.impl;

import com.kai.shoppingmall.entity.DiscountCoupon;
import com.kai.shoppingmall.repository.DiscountCouponRepository;
import com.kai.shoppingmall.response.BaseResponse;
import com.kai.shoppingmall.service.IDiscountCouponService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DiscountCouponService implements IDiscountCouponService {

    @Autowired
    DiscountCouponRepository discountCouponRepository;

    @Override
    public BaseResponse findAll() {
        BaseResponse baseResponse = new BaseResponse();
        List<DiscountCoupon> discountCouponList = discountCouponRepository.findAll();
        baseResponse.setStatus(true);
        baseResponse.setMessage("查詢成功");
        baseResponse.setData(discountCouponList);
        return baseResponse;
    }

}
