package com.kai.shoppingmall.entity;

import javax.persistence.*;

@Table
@Entity
public class OrderList {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer orderListId;

    @Column
    private Integer quantity;

    @ManyToOne
    @JoinColumn
    private Product productId;

    @ManyToOne
    @JoinColumn
    private Orders orderId;

    public Integer getOrderListId() {
        return orderListId;
    }
    public void setOrderListId(Integer orderListId) {
        this.orderListId = orderListId;
    }

    public Integer getQuantity() {
        return quantity;
    }
    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Product getProductId() {
        return productId;
    }
    public void setProductId(Product productId) {
        this.productId = productId;
    }

    public Orders getOrderId() {
        return orderId;
    }
    public void setOrderId(Orders orderId) {
        this.orderId = orderId;
    }
}
