package com.kai.shoppingmall.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer productId;

    @Column
    private String productName;

    @Column
    private Double price;

    @Column
    private Integer stock;

//    @JoinColumn
//    @OneToMany
//    private List<OrderList> orderLists;
//
//    @JoinColumn
//    @OneToMany
//    private List<ShoppingList> shoppingLists;

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

//    public List<OrderList> getOrderLists() {
//        return orderLists;
//    }
//
//    public void setOrderLists(List<OrderList> orderLists) {
//        this.orderLists = orderLists;
//    }
//
//    public List<ShoppingList> getShoppingLists() {
//        return shoppingLists;
//    }
//
//    public void setShoppingLists(List<ShoppingList> shoppingLists) {
//        this.shoppingLists = shoppingLists;
//    }
}
