package com.example.RideIT.Models;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
@Table(name = "coupon")
public class Coupon {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

    String CouponName;

    int percentage;
}
