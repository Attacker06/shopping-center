package com.kai.shoppingmall.controller;


import com.kai.shoppingmall.entity.DiscountCouponHolder;
import com.kai.shoppingmall.response.BaseResponse;
import com.kai.shoppingmall.service.impl.DiscountCouponHolderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/discountCouponHolder")
public class DiscountCouponHolderController {

    @Autowired
    DiscountCouponHolderService discountCouponHolderService;

    @GetMapping("findAll")
    public BaseResponse findAll(){
        return discountCouponHolderService.findAll();
    }
    @PostMapping("insert")
    public BaseResponse insert(@RequestBody DiscountCouponHolder discountCouponHolder){
        return discountCouponHolderService.insert(discountCouponHolder);
    }
    @GetMapping("select")
    public BaseResponse select(@RequestParam Integer id){
        return discountCouponHolderService.select(id);
    }
    @PutMapping("update")
    public BaseResponse update(@RequestBody DiscountCouponHolder discountCouponHolder){
        return discountCouponHolderService.update(discountCouponHolder);
    }
    @DeleteMapping("delete")
    public BaseResponse delete(@RequestParam Integer id){
        return discountCouponHolderService.delete(id);
    }
}
