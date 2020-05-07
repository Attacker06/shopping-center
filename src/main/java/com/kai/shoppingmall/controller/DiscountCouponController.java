package com.kai.shoppingmall.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/discountCoupon")
public class DiscountCouponController {

    @GetMapping("findAll")
    public String findAll(){
        return "ok";
    }
}
