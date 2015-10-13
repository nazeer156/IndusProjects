package com.indus.training.ui.impl;

import java.util.ArrayList;
import java.util.List;

import com.indus.persistance.domain.Orders;
import com.indus.persistance.impl.OnlineMartDAO;
import com.indus.persistance.search.SearchCustomer;
import com.indus.training.service.domain.CustomerTO;
import com.indus.training.service.domain.OrdersTO;
import com.indus.training.service.impl.IndusMartTAO;
import com.indus.training.service.search.SearchServiceCustomer;
import com.indus.training.ui.model.CustomerMO;
import com.indus.training.ui.model.OrdersMO;
import com.indus.training.ui.search.SearchUICustomer;
import com.indus.training.ui.search.SearchUIOrders;
import com.indus.training.ui.service.IIndusTrainingUI;

public class IndusTrainingUI implements IIndusTrainingUI {

	public CustomerMO getCustomerTODetails(SearchUICustomer SearchCustomerTO) {

		CustomerMO customerMO = new CustomerMO();
		SearchServiceCustomer searchServiceCustomer = new SearchServiceCustomer();
		searchServiceCustomer.setCustomerId(SearchCustomerTO.getCustomerId());
		IndusMartTAO indusMartTAO = new IndusMartTAO();
		CustomerTO customer = indusMartTAO
				.getCustomerTODetails(searchServiceCustomer);
		customerMO.setAddress(customer.getAddress());
		customerMO.setCustomerId(customer.getCustomerId());
		customerMO.setCustomerName(customer.getCustomerName());
		customerMO.setPhoneNumber(customer.getPhoneNumber());
		return customerMO;
	}

	public boolean saveCustomerTODetails(CustomerMO CustomerTOObject) {
		return false;
	}

	public boolean updateCustomerTODetails(CustomerMO CustomerTOObject) {
		return false;
	}

	public boolean DeleteCustomerTODetails(SearchUICustomer SearchCustomerTO) {
		return false;
	}

	public List<OrdersMO> getOrderDetails(SearchUICustomer SearchCustomerTO) {
		
		 
		SearchServiceCustomer searchCustomer = new SearchServiceCustomer();
		searchCustomer.setCustomerId(SearchCustomerTO.getCustomerId());
		IndusMartTAO onlineMartTAO = new IndusMartTAO();
		List<OrdersTO> ordersList = onlineMartTAO.getOrderDetails(searchCustomer);
		List<OrdersMO> ordersMOList = new ArrayList<OrdersMO>();
		for (OrdersTO ordersListLoop : ordersList) {
			OrdersMO e = new OrdersMO();
			e.setCustomerId(ordersListLoop.getCustomerId());
			e.setEmployeeId(ordersListLoop.getEmployeeId());
			e.setOrderDate(ordersListLoop.getOrderDate());
			e.setOrderId(ordersListLoop.getOrderId());
			e.setQuantity(ordersListLoop.getQuantity());
			e.setShipDate(ordersListLoop.getShipDate());
			e.setUnitPrice(ordersListLoop.getUnitPrice());
			ordersMOList.add(e);
		}
		return ordersMOList;
	}

	public boolean saveOrderDetails(OrdersMO orderObject) {
		return false;
	}

	public boolean DeleteOrderDetails(SearchUIOrders searchOrder) {
		return false;
	}

}
