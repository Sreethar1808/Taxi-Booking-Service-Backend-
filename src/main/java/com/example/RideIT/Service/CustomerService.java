package com.example.RideIT.Service;

import com.example.RideIT.Models.Customer;
import com.example.RideIT.Repository.CustomerRepository;
import com.example.RideIT.Transformer.CustomerTransformer;
import com.example.RideIT.dto.request.CustomerRequest;
import com.example.RideIT.dto.response.CustomerResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {

    @Autowired
    CustomerRepository customerRepository;
    public CustomerResponse addcustomer(CustomerRequest customerRequest) {


        Customer customer = CustomerTransformer.customerRequestToCustomer(customerRequest);

        Customer savedcustomer = customerRepository.save(customer);

        return CustomerTransformer.custometToCustomerResponse(savedcustomer);
    }
}
