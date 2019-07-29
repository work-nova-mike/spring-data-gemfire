package com.nova.gemfire.springdatagemfire.repository;

import java.util.List;

import org.springframework.data.gemfire.repository.GemfireRepository;
import org.springframework.data.gemfire.repository.Query;

import com.nova.gemfire.springdatagemfire.model.Customer;

public interface CustomerRepository extends GemfireRepository<Customer,Long>{
	
	List<Customer> findAll();
	
	@Query("SELECT * FROM /Customer x where x.firstname = $1")
    Customer findByFirstName(String emailAddress);

}