package com.example.RideIT.Repository;

import com.example.RideIT.Models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {
}
