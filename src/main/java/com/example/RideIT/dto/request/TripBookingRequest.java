package com.example.RideIT.dto.request;

import lombok.*;
import lombok.experimental.FieldDefaults;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class TripBookingRequest {
    String source;
    String destination;

    double tripDistanceInKm;

    String customerEmail;
}
