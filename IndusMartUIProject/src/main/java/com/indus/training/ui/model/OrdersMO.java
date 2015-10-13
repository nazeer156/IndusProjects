package com.indus.training.ui.model;

import java.io.Serializable;
import java.util.Date;

public class OrdersMO implements Serializable {

	/*
	 * Name Null Type ----------- -------- ---------- ORDER_ID NOT NULL
	 * NUMBER(15) CUSTOMER_ID NUMBER(4) EMPLOYEE_ID NUMBER(7) ORDER_DATE DATE
	 * SHIP_DATE DATE UNIT_PRICE NOT NULL NUMBER QUANTITY NOT NULL NUMBER
	 */

	private int orderId;
	private int customerId;
	private int employeeId;
	private Date orderDate;
	private Date shipDate;
	private int unitPrice;
	private int quantity;

	@Override
	public String toString() {
		return "Orders [orderId=" + orderId + ", customerId=" + customerId
				+ ", employeeId=" + employeeId + ", orderDate=" + orderDate
				+ ", shipDate=" + shipDate + ", unitPrice=" + unitPrice
				+ ", quantity=" + quantity + "]";
	}

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public Date getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}

	public Date getShipDate() {
		return shipDate;
	}

	public void setShipDate(Date shipDate) {
		this.shipDate = shipDate;
	}

	public int getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(int unitPrice) {
		this.unitPrice = unitPrice;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

}
