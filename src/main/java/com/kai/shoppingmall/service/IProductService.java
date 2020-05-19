package com.kai.shoppingmall.service;

import com.kai.shoppingmall.entity.Product;
import com.kai.shoppingmall.response.BaseResponse;

public interface IProductService {
    BaseResponse findAll();

    BaseResponse select(Integer id);

    BaseResponse insert(Product product);

    BaseResponse update(Product product);

    BaseResponse delete(Integer id);

    BaseResponse launch(Product product);

    BaseResponse changePrice(Product product);

    BaseResponse changeStock(Product product);
}
