package com.example.RideIT.dto.request;

import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.*;
import lombok.experimental.FieldDefaults;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@FieldDefaults(level = AccessLevel.PRIVATE)
@Builder
public class CabRequest {
    String company;
    String carModel;

    String cabNo;
    com.example.Ridelt.Enum.CarType carType;

    int numerOfSeats;

    double farPerKm;
}
