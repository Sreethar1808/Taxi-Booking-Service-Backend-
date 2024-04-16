package com.example.RideIT.Transformer;

import com.example.RideIT.Models.Coupon;

public class CouponTransformer {

    public static Coupon prepareCoupon(String CouponCode, int discount)
    {
        return Coupon.builder()
                .CouponName(CouponCode)
                .percentage(discount).build();

    }
}
