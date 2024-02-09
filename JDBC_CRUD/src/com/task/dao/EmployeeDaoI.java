package com.task.dao;

import java.sql.SQLException;

import com.task.crud.bean.Employee;

public interface EmployeeDaoI {

	public void insertEmployee(Employee emp) throws ClassNotFoundException, SQLException ;
	
	public void getEmployees() throws ClassNotFoundException, SQLException ;
	
	public void deleteEmployee(int did) throws ClassNotFoundException, SQLException ;
	
	public void updateEmployee(int uid, Employee e) throws ClassNotFoundException, SQLException ;


}
