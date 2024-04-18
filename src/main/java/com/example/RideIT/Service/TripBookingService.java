package com.example.RideIT.Service;

import com.example.RideIT.Models.Cab;
import com.example.RideIT.Models.Customer;
import com.example.RideIT.Models.TripBooking;
import com.example.RideIT.Repository.CabRepository;
import com.example.RideIT.Repository.CustomerRepository;
import com.example.RideIT.Repository.DriverRepository;
import com.example.RideIT.Repository.TripBookingRepository;
import com.example.RideIT.Transformer.TripBookingTransformer;
import com.example.RideIT.dto.request.TripBookingRequest;
import com.example.RideIT.dto.response.TripBookingResponse;
import com.example.RideIT.exception.CabNotFoundException;
import com.example.RideIT.exception.CustomerNotFoundException;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class TripBookingService {

    private final CustomerRepository customerRepository;

    private final CabRepository cabRepository;

    private final DriverRepository driverRepository;

    private final TripBookingRepository tripBookingRepository;

    public TripBookingResponse bookCab(String applyCoupon, TripBookingRequest tripBookingRequest) {

        Customer customer = customerRepository.findByemailId(tripBookingRequest.getCustomerEmail());
        if(customer==null)
        {
            throw new CustomerNotFoundException("Invalid email_ID");
        }

        Cab cab = cabRepository.getCabRandomly();
        if(cab==null)
        {
            throw new CabNotFoundException("Cab Not Availale");
        }

        TripBooking tripBooking = TripBookingTransformer.tripBookingRequestToTripBooking(tripBookingRequest);
        tripBooking.setTotalFare(cab.getFarPerKm()*tripBookingRequest.getTripDistanceInKm());
        tripBooking.setCustomer(customer);
        tripBooking.setDriver(cab.getDriver());

        TripBooking savedRepository = tripBookingRepository.save(tripBooking);
        customer.getBookings().add(savedRepository);
        cab.setAvailable(false);
        cab.getDriver().getBookingList().add(savedRepository);

        customerRepository.save(customer);
        driverRepository.save(cab.getDriver());

        return TripBookingTransformer.tripBookingTotripBookingResponse(tripBooking);
    }
}
