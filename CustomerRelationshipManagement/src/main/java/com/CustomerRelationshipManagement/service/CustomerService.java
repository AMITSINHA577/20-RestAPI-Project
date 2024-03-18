package com.CustomerRelationshipManagement.service;

import java.util.List;

import com.CustomerRelationshipManagement.entity.Customer;

public interface CustomerService {

	String insertCustomer(Customer customer);
	
	List<Customer> getCustomersList();
	
	Customer getCustomerById(int id);
	
	String customerUpdate(Customer customer);
	
	String delteCustomerById(int id); 
}
