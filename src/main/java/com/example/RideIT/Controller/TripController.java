package com.example.RideIT.Controller;

import com.example.RideIT.Service.TripBookingService;
import com.example.RideIT.dto.request.TripBookingRequest;
import com.example.RideIT.dto.response.TripBookingResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/trip")
public class TripController {

    private final TripBookingService tripBookingService;

    public TripController(TripBookingService tripBookingService) {
        this.tripBookingService = tripBookingService;
    }

    @PostMapping
    public ResponseEntity<TripBookingResponse> bookcab(@RequestParam(value="apply-coupon", required = false) String applyCoupon,
                                          @RequestBody TripBookingRequest tripBookingRequest)
    {
           TripBookingResponse response = tripBookingService.bookCab(applyCoupon,tripBookingRequest);
           return new ResponseEntity<>(response, HttpStatus.CREATED);
    }
}
