package com.kai.shoppingmall.service.impl;

import com.kai.shoppingmall.entity.Orders;
import com.kai.shoppingmall.repository.OrdersRepository;
import com.kai.shoppingmall.response.BaseResponse;
import com.kai.shoppingmall.service.IOrdersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrdersService implements IOrdersService {
    @Autowired
    OrdersRepository ordersRepository;

    @Override
    public BaseResponse findAll() {
        BaseResponse baseResponse = new BaseResponse();
        try {
            List<Orders> ordersList = ordersRepository.findAll();
            baseResponse.setStatus(true);
            baseResponse.setMessage("查詢成功");
            baseResponse.setData(ordersList);
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
            Orders orders = ordersRepository.getOne(id);
            baseResponse.setStatus(true);
            baseResponse.setMessage("查詢成功");
            baseResponse.setData(orders);
        }catch (Exception e){
            baseResponse.setStatus(false);
            baseResponse.setMessage("查詢失敗");
        }
        return baseResponse;
    }

    @Override
    public BaseResponse insert(Orders orders) {
        BaseResponse baseResponse = new BaseResponse();
        try {
            ordersRepository.save(orders);
            baseResponse.setStatus(true);
            baseResponse.setMessage("新增成功");
        }catch (Exception e){
            baseResponse.setStatus(false);
            baseResponse.setMessage("新增失敗");
        }
        return baseResponse;
    }

    @Override
    public BaseResponse update(Orders orders) {
        BaseResponse baseResponse = new BaseResponse();
        try {
            ordersRepository.save(orders);
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
            ordersRepository.deleteById(id);
            baseResponse.setStatus(true);
            baseResponse.setMessage("刪除成功");
        }catch (Exception e){
            baseResponse.setStatus(false);
            baseResponse.setMessage("刪除失敗");
        }
        return baseResponse;
    }
}
