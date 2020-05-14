package com.kai.shoppingmall.controller;

import com.kai.shoppingmall.entity.Product;
import com.kai.shoppingmall.response.BaseResponse;
import com.kai.shoppingmall.service.impl.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/product")
public class ProductController {


    @Autowired
    ProductService productService;

    @GetMapping("/findAll")
    public BaseResponse findAll(){
        return productService.findAll();
    }

    @PostMapping("/insert")
    public BaseResponse insert(@RequestBody Product product){
        return productService.insert(product);
    }

    @GetMapping("/select")
    public BaseResponse select(@RequestParam Integer id){
        return productService.select(id);
    }

    @PutMapping("/update")
    public BaseResponse update(@RequestBody Product product){
        return productService.update(product);
    }

    @DeleteMapping("/delete")
    public BaseResponse delete(@RequestParam Integer id){
        return productService.delete(id);
    }

    @PutMapping("/launch")
    public BaseResponse launch(@RequestBody Product product){
        return productService.launch(product);
    }
}
