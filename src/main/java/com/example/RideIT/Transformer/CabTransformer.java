package com.example.RideIT.Transformer;

import com.example.RideIT.Models.Cab;
import com.example.RideIT.dto.request.CabRequest;
import com.example.RideIT.dto.response.CabResponse;

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
                .available(true)
                .build();
    }

    public static CabResponse caToCabResponse(Cab cab)
    {
        return CabResponse.builder()
                .carModel(cab.getCarModel())
                .carType(cab.getCarType())
                .cabNo(cab.getCabNo())
                .numerOfSeats(cab.getNumerOfSeats())
                .farPerKm(cab.getFarPerKm())
                .build();
    }
}
