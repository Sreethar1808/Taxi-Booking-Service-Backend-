package com.example.RideIT.Models;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
@Table(name = "driver")
@Builder
public class Driver {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    String name;
    @Column(unique = true,nullable = false)
    String emailId;

    @Column(unique = true,nullable = false)
    String mobNo;

    String panNo;

    double rating;

    @OneToOne(mappedBy = "driver",cascade = CascadeType.ALL)
    Cab cab;

    @OneToMany(mappedBy = "driver", cascade = CascadeType.ALL)
    List<TripBooking> bookingList;
}
