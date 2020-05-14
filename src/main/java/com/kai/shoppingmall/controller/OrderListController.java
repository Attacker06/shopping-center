package com.kai.shoppingmall.controller;

import com.kai.shoppingmall.entity.OrderList;
import com.kai.shoppingmall.response.BaseResponse;
import com.kai.shoppingmall.service.impl.OrderListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

public class OrderListController {

    @Autowired
    OrderListService orderListService;

    @GetMapping("/findAll")
    public BaseResponse findAll(){
        return orderListService.findAll();
    }

    @PostMapping("/insert")
    public BaseResponse insert(@RequestBody OrderList orderList){
        return orderListService.insert(orderList);
    }

    @GetMapping("/select")
    public BaseResponse select(@RequestParam Integer id){
        return orderListService.select(id);
    }

    @PutMapping("/update")
    public BaseResponse update(@RequestBody OrderList orderList){
        return orderListService.update(orderList);
    }

    @DeleteMapping("/delete")
    public BaseResponse delete(@RequestParam Integer id){
        return orderListService.delete(id);
    }
}
