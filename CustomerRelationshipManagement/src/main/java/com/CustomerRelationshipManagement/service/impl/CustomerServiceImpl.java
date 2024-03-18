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

}
