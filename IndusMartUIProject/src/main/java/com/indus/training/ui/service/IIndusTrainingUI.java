package com.indus.training.ui.service;

import java.util.List;

import com.indus.training.ui.model.CustomerMO;
import com.indus.training.ui.model.OrdersMO;
import com.indus.training.ui.search.SearchUICustomer;
import com.indus.training.ui.search.SearchUIOrders;


public interface IIndusTrainingUI {
	public  CustomerMO getCustomerTODetails( SearchUICustomer SearchCustomerTO) ;

	public boolean saveCustomerTODetails( CustomerMO CustomerTOObject);

	public boolean updateCustomerTODetails(CustomerMO CustomerTOObject);

	public boolean DeleteCustomerTODetails(SearchUICustomer SearchCustomerTO);

	public List<OrdersMO> getOrderDetails(SearchUICustomer SearchCustomerTO);

	public  boolean saveOrderDetails( OrdersMO orderObject);

	public boolean DeleteOrderDetails(SearchUIOrders searchOrder);
}
