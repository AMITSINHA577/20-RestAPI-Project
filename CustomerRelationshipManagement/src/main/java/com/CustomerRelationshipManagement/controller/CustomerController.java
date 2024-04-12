package com.CustomerRelationshipManagement.controller;

import java.util.List;
import java.util.Map;

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

	@PostMapping
	public String multipalCustomerAdd(@RequestBody List<Customer> customers) {
		return customerService.multipalCustomerAdd(customers);

	}

	@GetMapping("/byName/{firstName}")
	public List<Customer> getCustomerByFirstName(@PathVariable String firstName) {
		return customerService.getCustomerbyName(firstName);
	}

	@GetMapping("/greaterAge/{age}")
	public List<Customer> getCustomerByAges(@PathVariable int age) {
		return customerService.getCustomerByAge(age);
	}

	@GetMapping("/LessAge/{age}")
	public List<Customer> getCustomerByAgesLessthen(@PathVariable int age) {
		return customerService.getCustomerByAgeLessthen(age);
	}

	@GetMapping("/getAllAge/{age}")
	public List<Customer> getAllCustomerAge(@PathVariable int age) {
		return customerService.getAllCustomerByAge(age);
	}

	@GetMapping("/getLastName/{last}")
	public List<Customer> getDataByLastName(@PathVariable String last) {
		return customerService.getCustomerDataByLastName(last);
	}

	@GetMapping("/byEmail/{email}")
	public List<Customer> getDatabyEmail(@PathVariable String email) {
		return customerService.getCustomerDataByEmail(email);
	}

	@GetMapping("/byPhone/{Pnumber}")
	public List<Customer> getDataByPhone(@PathVariable String Pnumber) {
		return customerService.getDataByNumber(Pnumber);
	}

	@PutMapping("/fname/{id}")
	public String updatefirstName(@PathVariable int id, @RequestBody Map<String, String> fsName) {
		String firstName = fsName.get("firstName");

		return customerService.updateFirstName(id, firstName);
	}

	@PutMapping("/lname/{id}")
	public String updateLastName(@PathVariable int id, @RequestBody Map<String, String> lName) {
		String lastName = lName.get("ladstName");
		return customerService.updateLastName(id, lastName);
	}

	@PutMapping("/emailUpdate/{id}")
	public String updateEmail(@PathVariable int id, @RequestBody Map<String, String> newEmail) {
		String newEmailData = newEmail.get("email");
		return customerService.updateEmail(id, newEmailData);
	}

	@PutMapping("/Mnumber/{id}")
	public String updateMnumber(@PathVariable int id, @RequestBody Map<String, String> NumberData) {
		String MnumberData = NumberData.get("mobileNumber");
		return customerService.updateMobileNumber(id, MnumberData);
	}

	@PutMapping("/ageupdate/{id}")
	public String ageUpdate(@PathVariable int id, @RequestBody Map<String, Integer> ageData) {

		int data = ageData.get("age");
		return customerService.updateAge(id, data);

	}

	@GetMapping("/getFirstName")
	public List<String> getFirstName() {
		return customerService.getCustomerFirstName();
	}

	@GetMapping("/getLastName")
	public List<String> getLastName() {
		return customerService.getCustomerLastName();
	}
}
