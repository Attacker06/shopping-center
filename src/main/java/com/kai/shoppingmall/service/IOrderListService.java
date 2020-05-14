package com.kai.shoppingmall.service;

import com.kai.shoppingmall.entity.OrderList;
import com.kai.shoppingmall.response.BaseResponse;

public interface IOrderListService {
    BaseResponse findAll();

    BaseResponse select(Integer id);

    BaseResponse insert(OrderList orderList);

    BaseResponse update(OrderList orderList);

    BaseResponse delete(Integer id);
}
