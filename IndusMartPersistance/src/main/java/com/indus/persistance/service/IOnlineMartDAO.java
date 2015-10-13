package com.indus.persistance.service;

import java.util.List;

import com.indus.persistance.domain.Customer;
import com.indus.persistance.domain.Orders;
import com.indus.persistance.exceptions.OnlineMartException;
import com.indus.persistance.search.SearchCustomer;
import com.indus.persistance.search.SearchOrder;

public interface IOnlineMartDAO {

	public Customer getCustomerDetails(SearchCustomer SearchCustomer);

	public boolean saveCustomerDetails(Customer customerObject);

	public boolean updateCustomerDetails(Customer customerObject);

	public boolean DeleteCustomerDetails(SearchCustomer SearchCustomer);

	public List<Orders> getOrderDetails(SearchCustomer SearchCustomer);

	public boolean saveOrderDetails(Orders orderObject);

	public boolean DeleteOrderDetails(SearchOrder searchOrder);

}
