package com.example.RideIT.Controller;

import com.example.RideIT.Service.CustomerService;
import com.example.RideIT.dto.request.CustomerRequest;
import com.example.RideIT.dto.response.CustomerResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/customer")
public class CustomerController {

//    @Autowired
//    CustomerService customerService;

    private final CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }


    @PostMapping
    public ResponseEntity<CustomerResponse> addcustomer(@RequestBody CustomerRequest customerRequest)
    {
        CustomerResponse response = customerService.addcustomer(customerRequest);
        return new ResponseEntity<>(response, HttpStatus.CREATED);
    }

    @GetMapping("/gender/{gender}/age/{age}")
    public ResponseEntity<List<CustomerResponse>> getCustomerfromage(@PathVariable("gender") String gender, @PathVariable("age") int age)
    {
        List<CustomerResponse> response = customerService.getCustomerfromage(gender, age);
        return new ResponseEntity<>(response,HttpStatus.FOUND);
    }
}
