package com.kai.shoppingmall.controller;

import com.kai.shoppingmall.entity.Orders;
import com.kai.shoppingmall.response.BaseResponse;
import com.kai.shoppingmall.service.impl.OrdersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/orders")
public class OrdersController {

    @Autowired
    OrdersService ordersService;

    @GetMapping("/findAll")
    public BaseResponse findAll(){
        return ordersService.findAll();
    }

    @PostMapping("/insert")
    public BaseResponse insert(@RequestBody Orders orders){
        return ordersService.insert(orders);
    }

    @GetMapping("/select")
    public BaseResponse select(@RequestParam Integer id){
        return ordersService.select(id);
    }

    @PutMapping("/update")
    public BaseResponse update(@RequestBody Orders orders){
        return ordersService.update(orders);
    }

    @DeleteMapping("/delete")
    public BaseResponse delete(@RequestParam Integer id){
        return ordersService.delete(id);
    }
}
