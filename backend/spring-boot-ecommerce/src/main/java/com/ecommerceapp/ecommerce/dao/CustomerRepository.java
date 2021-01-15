package com.ecommerceapp.ecommerce.dao;

import com.ecommerceapp.ecommerce.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}