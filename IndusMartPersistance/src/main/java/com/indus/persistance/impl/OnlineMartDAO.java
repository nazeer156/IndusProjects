package com.indus.persistance.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.indus.persistance.domain.Customer;
import com.indus.persistance.domain.Orders;
import com.indus.persistance.exceptions.OnlineMartException;
import com.indus.persistance.search.SearchCustomer;
import com.indus.persistance.search.SearchOrder;
import com.indus.persistance.service.IOnlineMartDAO;
import com.indus.persistance.util.HibernateUtil;

public class OnlineMartDAO implements IOnlineMartDAO {

	SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
	Session sessionObj ;

	public Customer getCustomerDetails(SearchCustomer SearchCustomer) {
		sessionObj = sessionFactory.openSession();
		Customer customer = (Customer) sessionObj.get(Customer.class,
				SearchCustomer.getCustomerId());
		sessionObj.close();
		return customer;
	}

	public boolean saveCustomerDetails(Customer customerObject) {
		boolean result = false;
		Transaction tx = sessionObj.beginTransaction();
		try {
			Integer customerId = (Integer) sessionObj.save(customerObject);
			result = true;
		} catch (HibernateException e) {
			result = false;
			System.out.println(e);
		}
		tx.commit();
		sessionObj.close();
		return result;
	}

	public boolean updateCustomerDetails(Customer customerObject) {
		boolean result = false;
		Transaction tx = sessionObj.beginTransaction();
		try {
			sessionObj.update(customerObject);
			result = true;
		} catch (HibernateException e) {
			result = false;
			System.out.println(e);
		}
		tx.commit();
		sessionObj.close();
		return result;
	}

	public boolean DeleteCustomerDetails(SearchCustomer SearchCustomer) {
		boolean result = false;
		Transaction tx = sessionObj.beginTransaction();
		try {
			Customer cusObj = (Customer) sessionObj.load(Customer.class,
					SearchCustomer.getCustomerId());
			Customer customer = new Customer();
			customer.setCustomerId(cusObj.getCustomerId());
			customer.setAddress(cusObj.getAddress());
			customer.setCustomerName(cusObj.getCustomerName());
			customer.setPhoneNumber(cusObj.getPhoneNumber());
			System.out.println(customer);
			sessionObj.delete(cusObj);
			tx.commit();
			result = true;
		} catch (HibernateException e) {
			result = false;
			System.out.println(e);
		}

		sessionObj.close();
		return result;
	}

	public List<Orders> getOrderDetails(SearchCustomer SearchCustomer) {
		sessionObj = sessionFactory.openSession();
		ArrayList<Orders> ordersList = new ArrayList<Orders>();
		
		Query queryObj = sessionObj
				.createQuery("FROM Orders o WHERE o.customerId="
						+ SearchCustomer.getCustomerId());
		
		List<Orders> list = queryObj.list();
		Iterator it = list.iterator();
		while (it.hasNext()) {
			ordersList.add((Orders) it.next());
		}

		sessionObj.close();
		return ordersList;
	}

	public boolean saveOrderDetails(Orders orderObject) {

		boolean result = false;
		Transaction tx = sessionObj.beginTransaction();
		try {
			Integer orderId = (Integer) sessionObj.save(orderObject);
			result = true;
		} catch (HibernateException e) {
			result = false;
			System.out.println(e);
		}
		tx.commit();
		sessionObj.close();
		return result;
	}

	public boolean DeleteOrderDetails(SearchOrder searchOrder) {
		boolean result = false;
		Transaction tx = sessionObj.beginTransaction();
		try {
			Orders ordObj = new Orders();
			sessionObj.delete(ordObj);
			result = true;
		} catch (HibernateException e) {
			result = false;
			System.out.println(e);
		}
		tx.commit();
		sessionObj.close();
		return result;
	}

}
