package com.task.bean;

public class Employee {
  private String empName;
  private String empAddress;
  private int empid;
public String getEmpName() {
	return empName;
}
public void setEmpName(String empName) {
	this.empName = empName;
}
public String getEmpAddress() {
	return empAddress;
}
public void setEmpAddress(String empAddress) {
	this.empAddress = empAddress;
}

public Employee() {
	super();
	
}
public Employee(String empName, String empAddress, int empid) {
	super();
	this.empName = empName;
	this.empAddress = empAddress;
	this.empid = empid;
}
public int getEmpid() {
	return empid;
}
public void setEmpid(int empid) {
	this.empid = empid;
}
@Override
public String toString() {
	return "Employee [empName=" + empName + ", empAddress=" + empAddress + "]";
}
  

}