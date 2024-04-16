package com.example.RideIT.Service;

import com.example.RideIT.Models.Cab;
import com.example.RideIT.Models.Driver;
import com.example.RideIT.Repository.DriverRepository;
import com.example.RideIT.Transformer.CabTransformer;
import com.example.RideIT.Transformer.DriverTransformer;
import com.example.RideIT.dto.request.CabRequest;
import com.example.RideIT.dto.request.DriverRequest;
import org.springframework.stereotype.Service;

@Service
public class DriverService {

//    @Autowired
//    DriverRepository driverRepository;

   private final DriverRepository driverRepository;

    public DriverService(DriverRepository driverRepository) {
        this.driverRepository = driverRepository;
    }


    public String addDriver(DriverRequest driverRequest) {

        CabRequest cabRequest = driverRequest.getCabRequest();

        Driver driver = DriverTransformer.driverRequestToDriver(driverRequest);

        Cab cab = CabTransformer.cabRequestToCab(cabRequest);

        driver.setCab(cab);
        cab.setDriver(driver);

        driverRepository.save(driver);
        return "Driver saved Successfully";
    }
}
