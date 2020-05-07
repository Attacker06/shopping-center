package com.kai.shoppingmall.entity;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Table
@Entity
public class Orders {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer orderId;

    @Column
    private Date orderDate;

    @Column
    private Integer orderAmount;

    @JoinColumn
    @ManyToOne
    private Member member;

//    @JoinColumn
//    @OneToMany
//    private List<OrderList> orderLists;

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public Integer getOrderAmount() {
        return orderAmount;
    }

    public void setOrderAmount(Integer orderAmount) {
        this.orderAmount = orderAmount;
    }

    public Member getMember() {
        return member;
    }

    public void setMember(Member member) {
        this.member = member;
    }

//    public List<OrderList> getOrderLists() {
//        return orderLists;
//    }
//
//    public void setOrderLists(List<OrderList> orderLists) {
//        this.orderLists = orderLists;
//    }
}
