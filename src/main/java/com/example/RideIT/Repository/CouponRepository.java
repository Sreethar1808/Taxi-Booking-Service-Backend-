package com.example.RideIT.Repository;

import com.example.RideIT.Models.Coupon;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CouponRepository extends JpaRepository<Coupon,Integer> {
}
