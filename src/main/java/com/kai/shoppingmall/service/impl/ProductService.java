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

    @Override
    public BaseResponse launch(Product product) {
        BaseResponse baseResponse = new BaseResponse();
        Integer productId = product.getProductId();
        Integer statusCode = product.getStatus();
        try{
            if (productId == null || statusCode == 1){
                productRepository.save(product);
                productRepository.changedStatus(statusCode);
                baseResponse.setMessage("上架成功");
            }else{
                productRepository.changedStatus(statusCode);
                baseResponse.setMessage("下架成功");
            }
            baseResponse.setStatus(true);
        }catch (Exception e){
            if(productId == null || statusCode == 1) {
                baseResponse.setMessage("上架失敗");
            }else{
                baseResponse.setMessage("下架失敗");
            }
            baseResponse.setStatus(false);
        }
        return baseResponse;
    }

    @Override
    public BaseResponse changePrice(Product product){
        BaseResponse baseResponse = new BaseResponse();
        Integer productPrice = product.getPrice();
        try{
            if(productPrice > 0){
                productRepository.save(product);
                baseResponse.setStatus(true);
                baseResponse.setMessage("更改價格成功");
            }else{
                baseResponse.setStatus(false);
                baseResponse.setMessage("更改價格失敗");
            }
        }catch (Exception e){
            baseResponse.setStatus(false);
            baseResponse.setMessage("更改價格失敗");
        }
        return baseResponse;
    }
    @Override
    public BaseResponse changeStock(Product product) {
        BaseResponse baseResponse = new BaseResponse();
        Integer productStock = product.getStock();
        try {
            if (productStock >= 0) {
                productRepository.save(product);
                baseResponse.setStatus(true);
                baseResponse.setMessage("更改庫存數量成功");
            } else {
                baseResponse.setStatus(false);
                baseResponse.setMessage("更改庫存數量失敗");
            }
        } catch (Exception e) {
            baseResponse.setStatus(false);
            baseResponse.setMessage("更改庫存數量失敗");
        }
        return baseResponse;
    }
}
