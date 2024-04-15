package com.example.RideIT.Models;

import com.example.Ridelt.Enum.Gender;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;
import org.springframework.boot.autoconfigure.web.WebProperties;

import java.util.ArrayList;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
@Table(name = "customer")
@Builder
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    String name;
    int age;

    @Column(unique = true,nullable = false)
    String emailId;
    String address;
    @Enumerated(EnumType.STRING)
    Gender gender;

    @OneToMany(mappedBy = "customer", cascade = CascadeType.ALL)

    List<com.example.RideIT.Models.TripBooking> bookings = new ArrayList<>();
}
