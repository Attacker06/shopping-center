package com.kai.shoppingmall.controller;

import com.kai.shoppingmall.entity.ShoppingList;
import com.kai.shoppingmall.response.BaseResponse;
import com.kai.shoppingmall.service.impl.ShoppingListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/shoppingList")
public class ShoppingListController {


    @Autowired
    ShoppingListService shoppingListService;

    @GetMapping("/findAll")
    public BaseResponse findAll(){
        return shoppingListService.findAll();
    }

    @PostMapping("/insert")
    public BaseResponse insert(@RequestBody  ShoppingList shoppingList){
        return shoppingListService.insert(shoppingList);
    }

    @GetMapping("/select")
    public BaseResponse select(@RequestParam Integer id){
        return shoppingListService.select(id);
    }

    @PutMapping("/update")
    public BaseResponse update(@RequestBody  ShoppingList shoppingList){
        return shoppingListService.update(shoppingList);
    }

    @DeleteMapping("/delete")
    public BaseResponse delete(@RequestParam Integer id){
        return shoppingListService.delete(id);
    }
}
