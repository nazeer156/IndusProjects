package com.indus.training.ui.impl;

import java.util.List;

import com.indus.training.ui.model.CustomerMO;
import com.indus.training.ui.model.OrdersMO;
import com.indus.training.ui.search.SearchUICustomer;
import com.indus.training.ui.search.SearchUIOrders;
import com.indus.training.ui.service.IIndusTrainingUI;

public class IndusMartPAO implements IIndusTrainingUI {

	private IIndusTrainingUI iIndusTrainingUIDelegate;

	public IndusMartPAO() {
		super();
	}

	public IIndusTrainingUI getiIndusTrainingUIDelegate() {
		return iIndusTrainingUIDelegate;
	}

	public void setiIndusTrainingUIDelegate(
			IIndusTrainingUI iIndusTrainingUIDelegate) {
		this.iIndusTrainingUIDelegate = iIndusTrainingUIDelegate;
	}

	public CustomerMO getCustomerTODetails(SearchUICustomer SearchCustomerTO) {
		return iIndusTrainingUIDelegate.getCustomerTODetails(SearchCustomerTO);
	}

	public boolean saveCustomerTODetails(CustomerMO CustomerTOObject) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean updateCustomerTODetails(CustomerMO CustomerTOObject) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean DeleteCustomerTODetails(SearchUICustomer SearchCustomerTO) {
		// TODO Auto-generated method stub
		return false;
	}

	public List<OrdersMO> getOrderDetails(SearchUICustomer SearchCustomerTO) {
		// TODO Auto-generated method stub
		return iIndusTrainingUIDelegate.getOrderDetails(SearchCustomerTO);
	}

	public boolean saveOrderDetails(OrdersMO orderObject) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean DeleteOrderDetails(SearchUIOrders searchOrder) {
		// TODO Auto-generated method stub
		return false;
	}

}
