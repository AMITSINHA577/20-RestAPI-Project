package com.CustomerRelationshipManagement.service;

import java.util.List;

import com.CustomerRelationshipManagement.entity.Customer;

public interface CustomerService {

	String insertCustomer(Customer customer);

	List<Customer> getCustomersList();

	Customer getCustomerById(int id);

	String customerUpdate(Customer customer);

	String delteCustomerById(int id);

	String multipalCustomerAdd(List<Customer> customers);

	List<Customer> getCustomerbyName(String firstName);

	List<Customer> getCustomerByAge(int age);
	
	List<Customer> getCustomerByAgeLessthen(int age);

	List<Customer> getAllCustomerByAge(int age);
	
	List<Customer> getCustomerDataByLastName(String last);
	
	List<Customer> getCustomerDataByEmail(String email);
	
	List<Customer> getDataByNumber(String Pnumber);
	
	String updateFirstName(int id, String firstName);
	
	String updateLastName(int id, String ladstName);
	
	String updateEmail(int id, String email);
	
	String updateMobileNumber(int id, String Mnumber);
	
	 String updateAge(int id, int age) ;

	 List<String> getCustomerFirstName();
	 
	 List<String> getCustomerLastName();
}
