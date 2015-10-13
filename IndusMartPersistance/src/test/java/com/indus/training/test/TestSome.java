package com.indus.training.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.indus.persistance.domain.Customer;
import com.indus.persistance.exceptions.OnlineMartException;
import com.indus.persistance.impl.OnlineMartDAO;
import com.indus.persistance.search.SearchCustomer;
import com.indus.persistance.service.IOnlineMartDAO;

public class TestSome {

	private IOnlineMartDAO onlineMartDAO;

	@Before
	public void setUp() throws Exception {
		onlineMartDAO = new OnlineMartDAO();
	}

	@After
	public void tearDown() throws Exception {
		onlineMartDAO = null;
	}

	@Test
	public void testGetOrderDetails() throws OnlineMartException {

//		SearchCustomer searchCustomer = new SearchCustomer();
//		searchCustomer.setCustomerId(1);
//		System.out.println(onlineMartDAO.getOrderDetails(searchCustomer)
//				.toString());
	}

	@Test
	public void saveCustomerDetails() throws OnlineMartException {

		// Customer customerObject = new Customer();
		// customerObject.setCustomerName("naz");
		// customerObject.setPhoneNumber(1234568891.0);
		// customerObject.setAddress("IN-IN");
		// System.out.println(onlineMartDAO.saveCustomerDetails(customerObject));
	}

//	@Test
//	public void deleteCustomerDetails() throws OnlineMartException {
//
//		SearchCustomer searchCustomer = new SearchCustomer();
//		searchCustomer.setCustomerId(4);
//
//		System.out.println(onlineMartDAO.DeleteCustomerDetails(searchCustomer));
//	}

}
