package com.example.RideIT.Repository;

import com.example.RideIT.Models.TripBooking;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TripBookingRepository extends JpaRepository<TripBooking, Integer> {
}
