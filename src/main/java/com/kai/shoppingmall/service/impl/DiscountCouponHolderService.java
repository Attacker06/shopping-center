package com.kai.shoppingmall.service.impl;

import com.kai.shoppingmall.entity.DiscountCouponHolder;
import com.kai.shoppingmall.repository.DiscountCouponHolderRepository;
import com.kai.shoppingmall.response.BaseResponse;
import com.kai.shoppingmall.service.IDiscountCouponHolderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DiscountCouponHolderService implements IDiscountCouponHolderService {

    @Autowired
    DiscountCouponHolderRepository discountCouponHolderRepository;

    @Override
    public BaseResponse findAll() {
        BaseResponse baseResponse = new BaseResponse();
        try {
            List<DiscountCouponHolder> discountCouponHolderList = discountCouponHolderRepository.findAll();
            baseResponse.setStatus(true);
            baseResponse.setMessage("查詢成功");
            baseResponse.setData(discountCouponHolderList);
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
            DiscountCouponHolder discountCouponHolder = discountCouponHolderRepository.getOne(id);
            baseResponse.setStatus(true);
            baseResponse.setMessage("查詢成功");
            baseResponse.setData(discountCouponHolder);
        }catch (Exception e){
            baseResponse.setStatus(false);
            baseResponse.setMessage("查詢失敗");
        }
        return baseResponse;
    }

    @Override
    public BaseResponse insert(DiscountCouponHolder discountCouponHolder) {
        BaseResponse baseResponse = new BaseResponse();
        try {
            discountCouponHolderRepository.save(discountCouponHolder);
            baseResponse.setStatus(true);
            baseResponse.setMessage("新增成功");
        }catch (Exception e){
            baseResponse.setStatus(false);
            baseResponse.setMessage("新增失敗");
        }
        return baseResponse;
    }

    @Override
    public BaseResponse update(DiscountCouponHolder discountCouponHolder) {
        BaseResponse baseResponse = new BaseResponse();
        try {
            discountCouponHolderRepository.save(discountCouponHolder);
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
            discountCouponHolderRepository.deleteById(id);
            baseResponse.setStatus(true);
            baseResponse.setMessage("刪除成功");
        }catch (Exception e){
            baseResponse.setStatus(false);
            baseResponse.setMessage("刪除失敗");
        }
        return baseResponse;
    }

}
