package com.example.RideIT.Transformer;

import com.example.RideIT.Models.Customer;
import com.example.RideIT.dto.request.CustomerRequest;
import com.example.RideIT.dto.response.CustomerResponse;

public class CustomerTransformer {

    public static Customer customerRequestToCustomer(CustomerRequest customerRequest)
    {
        return Customer.builder()
                .name(customerRequest.getName())
                .age(customerRequest.getAge())
                .emailId(customerRequest.getEmailId())
                .address(customerRequest.getAddress())
                .gender(customerRequest.getGender())
                .build();
    }

    public static CustomerResponse custometToCustomerResponse(Customer customer)
    {
        return CustomerResponse.builder()
                .name(customer.getName())
                .age(customer.getAge())
                .build();
    }
}
