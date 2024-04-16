package com.example.RideIT.Repository;

import com.example.RideIT.Models.Customer;
import com.example.RideIT.dto.response.CustomerResponse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {


    @Query(value="select * from customer where gender=:gender and age>=:age", nativeQuery = true)
    List<Customer> getCustomerbyage(String gender, int age);
}
