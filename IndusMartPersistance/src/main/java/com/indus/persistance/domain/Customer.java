package com.indus.persistance.domain;

import java.io.Serializable;

public class Customer implements Serializable {

	/*
	 * Name Null Type ------------- -------- ------------- CUSTOMER_ID NOT NULL
	 * NUMBER(4) CUSTOMER_NAME NOT NULL VARCHAR2(80) PHONE_NUMBER NUMBER(10)
	 * ADDRESS VARCHAR2(200)
	 */

	private Integer customerId;
	private String customerName;
	private Double phoneNumber;
	private String address;

	@Override
	public String toString() {
		return "Custormer [customerId=" + customerId + ", customerName="
				+ customerName + ", phoneNumber=" + phoneNumber + ", address="
				+ address + "]";
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
