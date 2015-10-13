package com.indus.persistance.delegate;

import java.util.List;

import com.indus.persistance.domain.Customer;
import com.indus.persistance.domain.Orders;
import com.indus.persistance.exceptions.OnlineMartException;
import com.indus.persistance.search.SearchCustomer;
import com.indus.persistance.search.SearchOrder;
import com.indus.persistance.service.IOnlineMartDAO;

public class OnlineMartDAODelegate implements IOnlineMartDAO {

	private IOnlineMartDAO onlineMartDAO;

	public OnlineMartDAODelegate(IOnlineMartDAO onlineMartDAO) {
		super();
		this.onlineMartDAO = onlineMartDAO;
	}

	public Customer getCustomerDetails(SearchCustomer SearchCustomer)
			 {
		Customer customerObj = onlineMartDAO.getCustomerDetails(SearchCustomer);
		return customerObj;
	}

	public boolean saveCustomerDetails(Customer customerObject)
			 {
       
		return onlineMartDAO.saveCustomerDetails(customerObject);
	}

	public boolean updateCustomerDetails(Customer customerObject)
			{
		return onlineMartDAO.updateCustomerDetails(customerObject);
	}

	public boolean DeleteCustomerDetails(SearchCustomer SearchCustomer)
			 {
		return onlineMartDAO.DeleteCustomerDetails(SearchCustomer);
	}

	public List<Orders> getOrderDetails(SearchCustomer SearchCustomer)
		 {
		return onlineMartDAO.getOrderDetails(SearchCustomer);
	}

	public boolean saveOrderDetails(Orders orderObject)
			 {
		return onlineMartDAO.saveOrderDetails(orderObject);
	}

	public boolean DeleteOrderDetails(SearchOrder searchOrder)
			{
		return onlineMartDAO.DeleteOrderDetails(searchOrder);
	}

}
