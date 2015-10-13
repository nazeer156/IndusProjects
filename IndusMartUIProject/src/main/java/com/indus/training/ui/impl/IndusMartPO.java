package com.indus.training.ui.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Transaction;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.transaction.TransactionDefinition;

import com.indus.training.service.domain.CustomerTO;
import com.indus.training.service.domain.OrdersTO;
import com.indus.training.service.search.SearchServiceCustomer;
import com.indus.training.ui.model.CustomerMO;
import com.indus.training.ui.model.OrdersMO;
import com.indus.training.ui.search.SearchUICustomer;
import com.indus.training.ui.service.IIndusTrainingUI;
import com.opensymphony.xwork2.ActionSupport;

public class IndusMartPO extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3855328580838787563L;

	private IIndusTrainingUI iIndusTrainingUI;
	private Integer customerId;
	private String customerName;
	private Double phoneNumber;
	private String address;
	private List<OrdersMO> ordersList = new ArrayList<OrdersMO>();

	public IndusMartPO() {
		super();
		ApplicationContext context = new ClassPathXmlApplicationContext(
				new String[] { "config.xml" });

		iIndusTrainingUI = context.getBean("IndusMartPAOProxy",
				IIndusTrainingUI.class);
	}

	@Override
	public String execute() throws Exception {
		return SUCCESS;
	}

	public void validate() {
		if (customerId == null) {
			addFieldError("customerId", "customerId is required");
		}
		else if (getCustomerTODetails().equals("failure")) {
			addFieldError("customerId", "Invalid User");
		}
	}

	public String getCustomerTODetails() {

		try{
		SearchUICustomer searchUICustomer = new SearchUICustomer();
		searchUICustomer.setCustomerId(customerId);
		CustomerMO customerMO = iIndusTrainingUI
				.getCustomerTODetails(searchUICustomer);
		// CalciOutput calciOutput = calcConvertor.add(calciInput);
		customerName = customerMO.getCustomerName();
		phoneNumber = customerMO.getPhoneNumber();
		address = customerMO.getAddress();
		}
		catch(Exception e){
			return "failure";
		}
		return SUCCESS;
	}

	public String getOrderMODetails(){
		
		try{
		System.out.println(customerId);
		SearchUICustomer searchUICustomer = new SearchUICustomer();
		searchUICustomer.setCustomerId(customerId);
		List<OrdersMO> list = iIndusTrainingUI
				.getOrderDetails(searchUICustomer);
	     for(OrdersMO listloop : list)
	     {
		   ordersList.add(listloop);
	     }
	     System.out.println(ordersList);
		}
		catch(Exception e){
			e.printStackTrace();
			System.out.println("some shi" + e);
			return "failure";
		}
		return SUCCESS;
	}
	
	public Integer getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public Double getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(Double phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

}
