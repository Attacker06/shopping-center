package com.kai.shoppingmall.service;

import com.kai.shoppingmall.entity.ShoppingList;
import com.kai.shoppingmall.response.BaseResponse;

public interface IShoppingListService {
    BaseResponse findAll();

    BaseResponse select(Integer id);

    BaseResponse insert(ShoppingList shoppingList);

    BaseResponse update(ShoppingList shoppingList);

    BaseResponse delete(Integer id);
}
