package com.CustomerRelationshipManagement.Dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;

import com.CustomerRelationshipManagement.entity.Customer;

@Repository
public class CustomerDao {

//	database code hum db ka code likhte h dao me like save karna delete ...

	SessionFactory sf;

	public CustomerDao(SessionFactory sf) {
		super();
		this.sf = sf;
	}

	public String InsertCustomerData(Customer customer) {
		Session session = sf.openSession();
		Transaction tr = session.beginTransaction();
		// insert update delete u need to use the transaction
		// save naam ki methode -> session

		session.save(customer);
		tr.commit();
		session.close();
		return "Customer Insert successfully";
	}

//	get all data from db

	public List<Customer> getCustomerAllDataList() {
		Session session = sf.openSession();
		return session.createQuery("from Customer").list();
	}

//	get single data from DB
//	here we have 2 methodes 1 GET and 2 LOAD
//	get -> it will  return null if object is not foud in DB
//	load -> it will return objectNotFoundException if object not found in DB

	public Customer getCustomerById(int id) {
		Session session = sf.openSession();
		Customer customer = session.get(Customer.class, id);

		return customer;
	}

//	update customer 

	public String updateCustomer(Customer customer) {
		Session session = sf.openSession();
		Transaction tr = session.beginTransaction();
		session.update(customer);
		tr.commit();
		session.close();
		return "Customer update successfully";

	}

//	delete customer

	public String deleteCustomer(int id) {
		Session session = sf.openSession();
		Transaction tr = session.beginTransaction();
		Customer customer = session.get(Customer.class, id);
		session.delete(customer);
		tr.commit();
		session.close();

		return "Customer delete Successfully";
	}

}
