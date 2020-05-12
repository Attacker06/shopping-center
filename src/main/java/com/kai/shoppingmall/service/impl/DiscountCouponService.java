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
        try {
            List<DiscountCoupon> discountCouponList = discountCouponRepository.findAll();
            baseResponse.setStatus(true);
            baseResponse.setMessage("查詢成功");
            baseResponse.setData(discountCouponList);
        }catch (Exception e){
            baseResponse.setStatus(false);
            baseResponse.setMessage("查詢失敗");
        }
        return baseResponse;
    }
    @Override
    public BaseResponse select(Integer id) {
        BaseResponse baseResponse = new BaseResponse();
        try {
            DiscountCoupon discountCoupon = discountCouponRepository.getOne(id);
            baseResponse.setStatus(true);
            baseResponse.setMessage("查詢成功");
            baseResponse.setData(discountCoupon);
        }catch (Exception e){
            baseResponse.setStatus(false);
            baseResponse.setMessage("查詢失敗");
        }
        return baseResponse;
    }

    @Override
    public BaseResponse insert(DiscountCoupon discountCoupon) {
        BaseResponse baseResponse = new BaseResponse();
        try {
            discountCouponRepository.save(discountCoupon);
            baseResponse.setStatus(true);
            baseResponse.setMessage("新增成功");
        }catch (Exception e){
            baseResponse.setStatus(false);
            baseResponse.setMessage("新增失敗");
        }
        return baseResponse;
    }

    @Override
    public BaseResponse update(DiscountCoupon discountCoupon) {
        BaseResponse baseResponse = new BaseResponse();
        try {
            discountCouponRepository.save(discountCoupon);
            baseResponse.setStatus(true);
            baseResponse.setMessage("修改成功");
        }catch (Exception e){
            baseResponse.setStatus(false);
            baseResponse.setMessage("修改失敗");
        }
        return baseResponse;
    }

    @Override
    public BaseResponse delete(Integer id) {
        BaseResponse baseResponse = new BaseResponse();
        try {
            discountCouponRepository.deleteById(id);
            baseResponse.setStatus(true);
            baseResponse.setMessage("刪除成功");
        }catch (Exception e){
            baseResponse.setStatus(false);
            baseResponse.setMessage("刪除失敗");
        }
        return baseResponse;
    }

}
