package com.nova.gemfire.springdatagemfire.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.nova.gemfire.springdatagemfire.model.Customer;
import com.nova.gemfire.springdatagemfire.repository.CustomerRepository;

@RestController
public class App {

	@Autowired
    CustomerRepository customerRepository = null;

    @RequestMapping(value="/saveCustomer", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE, produces = "application/json")
    public ResponseEntity<Customer> saveCustomer(@RequestBody Customer customer){
        customerRepository.save(customer);
        return new ResponseEntity<>(customer, HttpStatus.OK);
    }
    
    @RequestMapping(value="/recoverAll", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List <Customer>> recoverAll() {
        List <Customer> customer = customerRepository.findAll();
        return new ResponseEntity<>(customer, HttpStatus.OK);
    }
    
    @RequestMapping(value="/recoverById/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Customer> recoverById(@PathVariable Long id) {
        Customer customer = customerRepository.findOne(id);
        return new ResponseEntity<>(customer, HttpStatus.OK);
    }
    
    @RequestMapping(value="/recoverByFirstName/{name}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Customer> recoverByFirstName(@PathVariable String name) {
        Customer customer = customerRepository.findByFirstName(name);
        return new ResponseEntity<>(customer, HttpStatus.OK);
    }
	
}