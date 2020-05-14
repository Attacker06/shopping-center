package com.kai.shoppingmall.entity;

import javax.persistence.*;


@Table
@Entity

public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer productId;

    @Column
    private String productName;

    @Column
    private Integer price;

    @Column
    private Integer stock;

    @Column
    private Integer status;

    public Integer getProductId(){
        return productId;
    }
    public void setProductId(Integer productId){
        this.productId=productId;
    }

    public String getProductName(){
        return productName;
    }
    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Integer getPrice() {
        return price;
    }
    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getStock() {
        return stock;
    }
    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}
