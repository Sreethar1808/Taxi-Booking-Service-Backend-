package com.example.RideIT.Transformer;

import com.example.RideIT.Models.Driver;
import com.example.RideIT.dto.request.DriverRequest;

public class DriverTransformer {

    public static Driver driverRequestToDriver(DriverRequest driverRequest)
    {
          return Driver.builder()
                  .name(driverRequest.getName())
                  .emailId(driverRequest.getEmailId())
                  .mobNo(driverRequest.getMobNo())
                  .panNo(driverRequest.getPanNo())
                  .rating(0)
                  .build();
    }
}
