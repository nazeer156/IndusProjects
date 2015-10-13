package com.indus.persistance.domain;

import java.io.Serializable;

public class Employee implements Serializable  {
 
	/*Name          Null     Type          
	------------- -------- ------------- 
	EMPLOYEE_ID   NOT NULL NUMBER(7)     
	EMPLOYEE_NAME NOT NULL VARCHAR2(80)  
	ADDRESS       NOT NULL VARCHAR2(200) 
	PHONE_NUMBER           NUMBER(10) */
	
	private Double employeeId;
	private String employeeName;
	private String address;
	private Double phoneNumber;
	
	
	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName="
				+ employeeName + ", address=" + address + ", phoneNumber="
				+ phoneNumber + "]";
	}
	
	public Double getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(Double employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Double getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(Double phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
}
