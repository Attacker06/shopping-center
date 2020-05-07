package com.kai.shoppingmall.entity;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Table
@Entity
public class Member {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer memberId;

    @Column
    private String memberName;

    @Column
    private String memberPhone;

    @Column
    private String memberGender;

    @Column
    private Date memberBirthday;

    @Column
    private String memberAddress;

    @Column
    private String memberMail;

//    @OneToMany
//    @JoinColumn
//    private List<DiscountCouponHolder> discountCouponHolderList;
//
//    @OneToMany
//    @JoinColumn
//    private List<Orders> ordersList;

//    @OneToMany
//    @JoinColumn
//    private List<ProblemReport> problemReportList;
//
//    @OneToMany
//    @JoinColumn
//    private List<ShoppingList> shoppingLists;

    public Integer getMemberId() {
        return memberId;
    }

    public void setMemberId(Integer memberId) {
        this.memberId = memberId;
    }

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    public String getMemberPhone() {
        return memberPhone;
    }

    public void setMemberPhone(String memberPhone) {
        this.memberPhone = memberPhone;
    }

    public String getMemberGender() {
        return memberGender;
    }

    public void setMemberGender(String memberGender) {
        this.memberGender = memberGender;
    }

    public Date getMemberBirthday() {
        return memberBirthday;
    }

    public void setMemberBirthday(Date memberBirthday) {
        this.memberBirthday = memberBirthday;
    }

    public String getMemberAddress() {
        return memberAddress;
    }

    public void setMemberAddress(String memberAddress) {
        this.memberAddress = memberAddress;
    }

    public String getMemberMail() {
        return memberMail;
    }

    public void setMemberMail(String memberMail) {
        this.memberMail = memberMail;
    }

//    public List<DiscountCouponHolder> getDiscountCouponHolderList() {
//        return discountCouponHolderList;
//    }
//
//    public void setDiscountCouponHolderList(List<DiscountCouponHolder> discountCouponHolderList) {
//        this.discountCouponHolderList = discountCouponHolderList;
//    }
//
//    public List<Orders> getOrdersList() {
//        return ordersList;
//    }
//
//    public void setOrdersList(List<Orders> ordersList) {
//        this.ordersList = ordersList;
//    }

//    public List<ProblemReport> getProblemReportList() {
//        return problemReportList;
//    }
//
//    public void setProblemReportList(List<ProblemReport> problemReportList) {
//        this.problemReportList = problemReportList;
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
