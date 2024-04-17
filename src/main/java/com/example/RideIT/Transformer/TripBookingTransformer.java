package com.example.RideIT.Transformer;

import com.example.RideIT.Models.TripBooking;
import com.example.RideIT.dto.request.TripBookingRequest;
import com.example.RideIT.dto.response.TripBookingResponse;
import com.example.Ridelt.Enum.TripStatus;

import java.util.UUID;

public class TripBookingTransformer {

    public static TripBooking tripBookingRequestToTripBooking(TripBookingRequest tripBookingRequest)
    {
        return TripBooking.builder()
                .bookingId(String.valueOf(UUID.randomUUID()))
                .source(tripBookingRequest.getSource())
                .destination(tripBookingRequest.getDestination())
                .tripDistanceInKm(tripBookingRequest.getTripDistanceInKm())
                .tripStatus(TripStatus.IN_TRANSIT)
                .build();
    }

    public static TripBookingResponse tripBookingTotripBookingResponse(TripBooking tripBooking)
    {
        return TripBookingResponse.builder()
                .bookingId(tripBooking.getBookingId())
                .source(tripBooking.getSource())
                .destination(tripBooking.getDestination())
                .tripDistanceInKm(tripBooking.getTripDistanceInKm())
                .totalFare(tripBooking.getTotalFare())
                .tripStatus(tripBooking.getTripStatus())
                .bookedAt(tripBooking.getBookedAt())
                .customerResponse(CustomerTransformer.custometToCustomerResponse(tripBooking.getCustomer()))
                .driverResponse(DriverTransformer.driverToDriverResponse(tripBooking.getDriver()))
                .build();

    }
}
