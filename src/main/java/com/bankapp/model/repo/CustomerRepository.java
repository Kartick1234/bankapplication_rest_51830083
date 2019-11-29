package com.bankapp.model.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bankapp.model.entities.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long>{

}
