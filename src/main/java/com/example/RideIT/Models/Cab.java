package com.example.RideIT.Models;


import com.example.Ridelt.Enum.CarType;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
@Table(name = "cab")
@Builder
public class Cab {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

    String company;
    String carModel;
    @Enumerated(EnumType.STRING)
    CarType carType;

    @Column(unique = true,nullable = false)
    String cabNo;
    int numerOfSeats;

    double farPerKm;

    boolean available;
    @OneToOne
    @JoinColumn
    Driver driver;
}
