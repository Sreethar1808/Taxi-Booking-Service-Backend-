package com.example.RideIT.dto.response;

import jakarta.persistence.Column;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.*;
import lombok.experimental.FieldDefaults;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
@Builder
public class CabResponse {
    String carModel;

    com.example.Ridelt.Enum.CarType carType;

    String cabNo;
    int numerOfSeats;

    double farPerKm;
}
