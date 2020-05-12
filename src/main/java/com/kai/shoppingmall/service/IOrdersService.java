package com.kai.shoppingmall.service;

import com.kai.shoppingmall.entity.Orders;
import com.kai.shoppingmall.response.BaseResponse;

public interface IOrdersService {
    BaseResponse findAll();

    BaseResponse select(Integer id);

    BaseResponse insert(Orders orders);

    BaseResponse update(Orders orders);

    BaseResponse delete(Integer id);
}
