package com.CustomerRelationshipManagement.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.CustomerRelationshipManagement.Dao.CustomerDao;
import com.CustomerRelationshipManagement.entity.Customer;
import com.CustomerRelationshipManagement.service.CustomerService;

@Service
public class CustomerServiceImpl implements CustomerService {

	CustomerDao customerDao;

	public CustomerServiceImpl(CustomerDao customerDao) {
		super();
		this.customerDao = customerDao;
	}

	@Override
	public String insertCustomer(Customer customer) {
		return customerDao.InsertCustomerData(customer);
	}

	@Override
	public List<Customer> getCustomersList() {
		// TODO Auto-generated method stub

		List<Customer> list = customerDao.getCustomerAllDataList();
		return list;
	}

	@Override
	public Customer getCustomerById(int id) {

		return customerDao.getCustomerById(id);
	}

	@Override
	public String customerUpdate(Customer customer) {
		// TODO Auto-generated method stub
		return customerDao.updateCustomer(customer);
	}

	@Override
	public String delteCustomerById(int id) {
		// TODO Auto-generated method stub
		return customerDao.deleteCustomer(id);
	}

	@Override
	public String multipalCustomerAdd(List<Customer> customers) {
		// TODO Auto-generated method stub
		return customerDao.multipalCustomerAdd(customers);
	}

	@Override
	public List<Customer> getCustomerbyName(String firstName) {
		// TODO Auto-generated method stubs

		return customerDao.getCustomerbyName(firstName);
	}

	@Override
	public List<Customer> getCustomerByAge(int age) {
		// TODO Auto-generated method stub
		return customerDao.getCustomerByAge(age);
	}

	@Override
	public List<Customer> getCustomerByAgeLessthen(int age) {
		// TODO Auto-generated method stub
		return customerDao.getCustomerByAgeLessthen(age);
	}

	@Override
	public List<Customer> getAllCustomerByAge(int age) {
		// TODO Auto-generated method stub
		return customerDao.getAllCustomerByAge(age);
	}

	@Override
	public List<Customer> getCustomerDataByLastName(String last) {
		// TODO Auto-generated method stub
		return customerDao.getCustomerDataByLastName(last);
	}

	@Override
	public List<Customer> getCustomerDataByEmail(String email) {
		// TODO Auto-generated method stub
		return customerDao.getCustomerDataByEmail(email);
	}

	@Override
	public List<Customer> getDataByNumber(String Pnumber) {
		// TODO Auto-generated method stub
		return customerDao.getDataByNumber(Pnumber);
	}

	@Override
	public String updateFirstName(int id, String firstName) {
		// TODO Auto-generated method stub
		return customerDao.updateFirstName(id, firstName);
	}

	@Override
	public String updateLastName(int id, String ladstName) {
		// TODO Auto-generated method stub
		return customerDao.updateLastName(id, ladstName);
	}

	@Override
	public String updateEmail(int id, String email) {
		// TODO Auto-generated method stub
		return customerDao.updateEmail(id, email);
	}

	@Override
	public String updateMobileNumber(int id, String Mnumber) {
		// TODO Auto-generated method stub
		return customerDao.updateMobileNumber(id, Mnumber);
	}

	@Override
	public String updateAge(int id, int age) {
		// TODO Auto-generated method stub
		return customerDao.updateAge(id, age);
	}

	@Override
	public List<String> getCustomerFirstName() {
		// TODO Auto-generated method stub
		return customerDao.getCustomerFirstName();
	}

	@Override
	public List<String> getCustomerLastName() {
		// TODO Auto-generated method stub
		return customerDao.getCustomerLastName();
	}


}
