package com.example.RideIT.Transformer;

import com.example.RideIT.Models.Cab;
import com.example.RideIT.Models.Driver;
import com.example.RideIT.dto.request.DriverRequest;
import com.example.RideIT.dto.response.CabResponse;
import com.example.RideIT.dto.response.DriverResponse;

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

    public static DriverResponse driverToDriverResponse(Driver driver)
    {
        return DriverResponse.builder()
                .name(driver.getName())
                .mobNo(driver.getMobNo())
                .rating(driver.getRating())
                .cabResponse(CabTransformer.caToCabResponse(driver.getCab()))
                .build();
    }


}
