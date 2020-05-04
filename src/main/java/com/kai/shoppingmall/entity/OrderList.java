package com.kai.shoppingmall.entity;

import javax.persistence.*;

@Entity
@Table
public class OrderList {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer OrderListId;

    @Column
    private Integer Quantity;

    @JoinColumn
    @ManyToOne
    private Product product;

    @JoinColumn
    @ManyToOne
    private Orders orders;

    public Integer getOrderListId() {
        return OrderListId;
    }

    public void setOrderListId(Integer orderListId) {
        OrderListId = orderListId;
    }

    public Integer getQuantity() {
        return Quantity;
    }

    public void setQuantity(Integer quantity) {
        Quantity = quantity;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Orders getOrders() {
        return orders;
    }

    public void setOrders(Orders orders) {
        this.orders = orders;
    }
}
