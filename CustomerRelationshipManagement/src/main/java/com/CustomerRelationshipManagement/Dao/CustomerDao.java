package com.CustomerRelationshipManagement.Dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
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

	// multipal customer adding

	public String multipalCustomerAdd(List<Customer> customers) {

		Session session = sf.openSession();
		Transaction tr = session.beginTransaction();
		for (Customer customerData : customers) {
			session.save(customerData);
		}
		tr.commit();
		session.close();

		return "Multipal Customer added successfully";
	}

//	get customer data useing name

	public List<Customer> getCustomerbyName(String firstName) {
		Session session = sf.openSession();

		Query<Customer> QueryDatacustomer = session.createQuery("from Customer c where c.firstName=:firstName",
				Customer.class);
		QueryDatacustomer.setParameter("firstName", firstName);
		List<Customer> listdata = QueryDatacustomer.list();
		return listdata;
	}

	// get data by age greater then>

	public List<Customer> getCustomerByAge(int age) {
		Session session = sf.openSession();
		Query<Customer> Qdata = session.createQuery("from Customer c where c.age>:age", Customer.class);
		Qdata.setParameter("age", age);
		List<Customer> listAge = Qdata.list();
		return listAge;
	}

	// get data by age less then>

	public List<Customer> getCustomerByAgeLessthen(int age) {
		Session session = sf.openSession();
		Query<Customer> Qdata = session.createQuery("from Customer c where c.age<:age", Customer.class);
		Qdata.setParameter("age", age);
		List<Customer> listAge = Qdata.list();
		return listAge;
	}

//		get all customer data by age 

	public List<Customer> getAllCustomerByAge(int age) {
		Session session = sf.openSession();
		Query<Customer> QdataAge = session.createQuery("from Customer c where c.age=:age", Customer.class);
		QdataAge.setParameter("age", age);
		List<Customer> customersAgeData = QdataAge.list();
		return customersAgeData;
	}

//	get customer data by lastName

	public List<Customer> getCustomerDataByLastName(String lastName) {
		Session session = sf.openSession();
		Query<Customer> QLastName = session.createQuery("from Customer c where c.ladstName=:lastName", Customer.class);
		QLastName.setParameter("lastName", lastName);
		List<Customer> listDataLastName = QLastName.list();
		return listDataLastName;
	}

//	get customer data by email 

	public List<Customer> getCustomerDataByEmail(String email) {
		Session session = sf.openSession();
		Query<Customer> QEmail = session.createQuery("from Customer c where c.email=:email", Customer.class);
		QEmail.setParameter("email", email);
		List<Customer> listOfEmail = QEmail.list();
		return listOfEmail;

	}

//	get customer data by phone number

	public List<Customer> getDataByNumber(String Pnumber) {
		Session session = sf.openSession();
		Query<Customer> QPhone = session.createQuery("from Customer c where c.mobileNumber=:Pnumber", Customer.class);
		QPhone.setParameter("Pnumber", Pnumber);
		List<Customer> listPhone = QPhone.list();
		return listPhone;

	}

//	update firastname of user

	public String updateFirstName(int id, String firstName) {
		Session session = sf.openSession();
		Transaction tr = session.beginTransaction();
		Customer customer = session.get(Customer.class, id);
		customer.setFirstName(firstName);
		tr.commit();
		sf.close();

		return "update successfully";

	}
//		update lastname of user

	public String updateLastName(int id, String ladstName) {
		Session session = sf.openSession();
		Transaction tr = session.beginTransaction();
		Customer customer = session.get(Customer.class, id);
		customer.setLadstName(ladstName);
		tr.commit();
		sf.close();

		return "last name update successfully";

	}

//	update email of user

	public String updateEmail(int id, String email) {
		Session session = sf.openSession();
		Transaction tr = session.beginTransaction();
		Customer customer = session.get(Customer.class, id);
		customer.setEmail(email);
		tr.commit();
		sf.close();

		return "email updated successfully";

	}

//	update mobile number

	public String updateMobileNumber(int id, String Mnumber) {
		Session session = sf.openSession();
		Transaction tr = session.beginTransaction();
		Customer customer = session.get(Customer.class, id);
		customer.setMobileNumber(Mnumber);
		tr.commit();
		sf.close();
		return "mobile number updatede successfully";
	}

//	update customer age

	public String updateAge(int id, int age) {
		Session session = sf.openSession();
		Transaction tr = session.beginTransaction();
		Customer customer = session.get(Customer.class, id);
		customer.setAge(age);
		tr.commit();
		sf.close();
		return "age updatede successfully";
	}

//	get customer first name

	public List<String> getCustomerFirstName() {
		Session session = sf.openSession();
		return session.createQuery("select c.firstName from Customer c").list();
	}

//	get customer last name

	public List<String> getCustomerLastName() {
		Session session = sf.openSession();
		return session.createQuery("select c.ladstName from Customer c").list();
	}
	
	
}
