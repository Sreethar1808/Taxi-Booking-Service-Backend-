package com.example.RideIT.Controller;

import com.example.RideIT.Service.CustomerService;
import com.example.RideIT.dto.request.CustomerRequest;
import com.example.RideIT.dto.response.CustomerResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/customer")
public class CustomerController {

    @Autowired
    CustomerService customerService;
    @PostMapping
    public ResponseEntity<CustomerResponse> addcustomer(@RequestBody CustomerRequest customerRequest)
    {
        CustomerResponse response = customerService.addcustomer(customerRequest);
        return new ResponseEntity<>(response, HttpStatus.CREATED);
    }
}
