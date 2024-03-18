package com.CustomerRelationshipManagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.CustomerRelationshipManagement.entity.Customer;
import com.CustomerRelationshipManagement.service.CustomerService;

@RestController
@RequestMapping("/api/customer")
public class CustomerController {

	@Autowired
	CustomerService customerService;

	public CustomerController(CustomerService customerService) {
		super();
		this.customerService = customerService;
	}

	@PostMapping("/insert")
	public String insertCustomer(@RequestBody Customer customer) {
		return customerService.insertCustomer(customer);
	}

//	all data of customer

	@GetMapping("/allData")
	public List<Customer> getCustomerAllList() {
		return customerService.getCustomersList();
	}

//	get single data from db

	@GetMapping("/{id}")
	public Customer getCustomerById(@PathVariable int id) {
		return customerService.getCustomerById(id);
	}

	@PutMapping
	public String customerUpdate(@RequestBody Customer customer) {
		return customerService.customerUpdate(customer);
	}

	@DeleteMapping("/{id}")
	public String delteCustomerById(@PathVariable int id) {
		return customerService.delteCustomerById(id);
	}
}
