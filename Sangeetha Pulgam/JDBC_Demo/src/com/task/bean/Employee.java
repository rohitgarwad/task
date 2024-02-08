package com.task.bean;

import java.sql.Connection;

@SuppressWarnings("unused")
public class Employee 
{
	private static String empName;
	private static String empAddress;
	public String getEmpName() {
		return empName;
	}
	@SuppressWarnings("static-access")
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmpAddress() {
		return empAddress;
	}
	@SuppressWarnings("static-access")
	public void setEmpAddress(String empAddress) {
		this.empAddress = empAddress;
	}
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	@SuppressWarnings("static-access")
	public Employee(String empName, String empAddress) {
		super();
		this.empName = empName;
		this.empAddress = empAddress;
	}
	@Override
	public String toString() {
		return "Employee [empName=" + empName + ", empAddress=" + empAddress + "]";
	}
	public static String getDBConnection() {
		// TODO Auto-generated method stub
		return "Employee[empName="+empName +", empAddress=" + empAddress +"]";
	}
	
}
