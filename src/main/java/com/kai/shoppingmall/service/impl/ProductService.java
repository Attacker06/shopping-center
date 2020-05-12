package com.kai.shoppingmall.service.impl;

import com.kai.shoppingmall.entity.Product;
import com.kai.shoppingmall.repository.ProductRepository;
import com.kai.shoppingmall.response.BaseResponse;
import com.kai.shoppingmall.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService implements IProductService {

    @Autowired
    ProductRepository productRepository;

    @Override
    public BaseResponse findAll() {
        BaseResponse baseResponse = new BaseResponse();
        try {
            List<Product> productList = productRepository.findAll();
            baseResponse.setStatus(true);
            baseResponse.setMessage("查詢成功");
            baseResponse.setData(productList);
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
            Product product = productRepository.getOne(id);
            baseResponse.setStatus(true);
            baseResponse.setMessage("查詢成功");
            baseResponse.setData(product);
        }catch (Exception e){
            baseResponse.setStatus(false);
            baseResponse.setMessage("查詢失敗");
        }
        return baseResponse;
    }

    @Override
    public BaseResponse insert(Product product) {
        BaseResponse baseResponse = new BaseResponse();
        try {
            productRepository.save(product);
            baseResponse.setStatus(true);
            baseResponse.setMessage("新增成功");
        }catch (Exception e){
            baseResponse.setStatus(false);
            baseResponse.setMessage("新增失敗");
        }
        return baseResponse;
    }

    @Override
    public BaseResponse update(Product product) {
        BaseResponse baseResponse = new BaseResponse();
        try {
            productRepository.save(product);
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
            productRepository.deleteById(id);
            baseResponse.setStatus(true);
            baseResponse.setMessage("刪除成功");
        }catch (Exception e){
            baseResponse.setStatus(false);
            baseResponse.setMessage("刪除失敗");
        }
        return baseResponse;
    }
}
