package com.kai.shoppingmall.entity;

import javax.persistence.*;

@Table
@Entity
public class DiscountCouponHolder {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer discountCouponHolderId;

    @JoinColumn
    @ManyToOne
    private DiscountCoupon discountCoupon;

    @JoinColumn
    @ManyToOne
    private Member member;

    public Integer getDiscountCouponHolderId() {
        return discountCouponHolderId;
    }
    public void setDiscountCouponHolderId(Integer discountCouponHolderId) {
        this.discountCouponHolderId = discountCouponHolderId;
    }

    public DiscountCoupon getDiscountCoupon() {
        return discountCoupon;
    }
    public void setDiscountCoupon(DiscountCoupon discountCoupon) {
        this.discountCoupon = discountCoupon;
    }

    public Member getMember() {
        return member;
    }
    public void setMember(Member member) {
        this.member = member;
    }
}
