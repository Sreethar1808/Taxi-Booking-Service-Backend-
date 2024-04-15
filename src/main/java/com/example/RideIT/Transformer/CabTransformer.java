package com.example.RideIT.Transformer;

import com.example.RideIT.Models.Cab;
import com.example.RideIT.dto.request.CabRequest;

public class CabTransformer {

    public static Cab cabRequestToCab(CabRequest cabRequest)
    {
        return Cab.builder()
                .company(cabRequest.getCompany())
                .carModel(cabRequest.getCarModel())
                .cabNo(cabRequest.getCabNo())
                .carType(cabRequest.getCarType())
                .numerOfSeats(cabRequest.getNumerOfSeats())
                .farPerKm(cabRequest.getFarPerKm())
                .build();
    }
}
