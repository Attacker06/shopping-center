package com.kai.shoppingmall.entity;

import javax.persistence.*;
import java.util.Date;

@Table
@Entity
public class DiscountCoupon {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer discountCouponId;

    @Column
    private Date expirationDate;

    @Column
    private Double discountPercentOff;

    public Integer getDiscountCouponId() {
        return discountCouponId;
    }

    public void setDiscountCouponId(Integer discountCouponId) {
        this.discountCouponId = discountCouponId;
    }

    public Date getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(Date expirationDate) {
        this.expirationDate = expirationDate;
    }

    public Double getDiscountPercentOff() {
        return discountPercentOff;
    }

    public void setDiscountPercentOff(Double discountPercentOff) {
        this.discountPercentOff = discountPercentOff;
    }
}
