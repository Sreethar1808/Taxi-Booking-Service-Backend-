package com.example.RideIT.dto.response;

import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.Date;
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
@Builder
public class TripBookingResponse {

    String bookingId;
    String source;
    String destination;

    double tripDistanceInKm;

    double totalFare;

    com.example.Ridelt.Enum.TripStatus tripStatus;

    Date bookedAt;

    CustomerResponse customerResponse;

    DriverResponse driverResponse;
}
