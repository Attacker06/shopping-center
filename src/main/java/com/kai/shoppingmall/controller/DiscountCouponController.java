package com.kai.shoppingmall.controller;

import com.kai.shoppingmall.response.BaseResponse;
import com.kai.shoppingmall.service.impl.DiscountCouponService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/discountCoupon")
public class DiscountCouponController {

    @Autowired
    DiscountCouponService discountCouponService;

    @GetMapping("/findAll")
    public BaseResponse findAll(){
        return discountCouponService.findAll();
    }
}
