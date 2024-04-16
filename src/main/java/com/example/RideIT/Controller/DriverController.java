package com.example.RideIT.Controller;

import com.example.RideIT.Service.DriverService;
import com.example.RideIT.dto.request.DriverRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/driver")
public class DriverController {

//    @Autowired
//    DriverService driverService;

    private final DriverService driverService;

    public DriverController(DriverService driverService) {
        this.driverService = driverService;
    }

    @PostMapping
    public ResponseEntity<String> addDriver(@RequestBody DriverRequest driverRequest)
   {
        String response = driverService.addDriver(driverRequest);
        return new ResponseEntity<>(response, HttpStatus.CREATED);
   }
}
