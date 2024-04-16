package com.example.RideIT.Service;

import com.example.RideIT.Models.Coupon;
import com.example.RideIT.Repository.CouponRepository;
import com.example.RideIT.Transformer.CouponTransformer;
import org.springframework.stereotype.Service;

@Service
public class CouponService {

    private final CouponRepository couponRepository;

    public CouponService(CouponRepository couponRepository) {
        this.couponRepository = couponRepository;
    }

    public String addCoupon(String couponCode, int discount) {

        Coupon coupon = CouponTransformer.prepareCoupon(couponCode,discount);
        couponRepository.save(coupon);
        return "Coupon code added Successfully";
    }
}
