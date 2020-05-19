package com.kai.shoppingmall.controller;

import com.kai.shoppingmall.entity.DiscountCoupon;
import com.kai.shoppingmall.response.BaseResponse;
import com.kai.shoppingmall.service.impl.DiscountCouponService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.Date;

@RestController
@RequestMapping("/discountCoupon")
public class DiscountCouponController {

    @Autowired
    DiscountCouponService discountCouponService;

    @GetMapping("/findAll")
    public BaseResponse findAll(){
        return discountCouponService.findAll();
    }

    @PostMapping("/insert")
    public BaseResponse insert(@RequestBody DiscountCoupon discountCoupon){
        return discountCouponService.insert(discountCoupon);
    }

    @GetMapping("/select")
    public BaseResponse select(@RequestParam Integer id){
        return discountCouponService.select(id);
    }

    @PutMapping("/update")
    public BaseResponse update(@RequestBody DiscountCoupon discountCoupon){
        return discountCouponService.update(discountCoupon);
    }

    @DeleteMapping("/delete")
    public BaseResponse delete(@RequestParam Integer id){
        return discountCouponService.delete(id);
    }

    @PostMapping("/addCoupon")
    public BaseResponse addCoupon(@RequestBody DiscountCoupon discountCoupon){
        return discountCouponService.addCoupon(discountCoupon);
    }

    @GetMapping("/addCouponWithAmount")
    public BaseResponse addCouponWithAmount(@RequestParam Date expireDate,@RequestParam Double amount,@RequestParam Double percentOff){
        return discountCouponService.addCouponWithAmount(expireDate, amount, percentOff);
    }
}
