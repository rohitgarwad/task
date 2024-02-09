package com.task.service;

import java.sql.SQLException;

import com.task.crud.bean.Employee;
import com.task.dao.EmployeeDaoImpl;
import com.task.dao.EmployeeDaoI;

public class EmployeeServiceImpl implements EmployeeServiceI {

	
	@Override
	public void insertEmployee(Employee emp) throws ClassNotFoundException, SQLException {
		EmployeeDaoI dao = new EmployeeDaoImpl();
		
		dao.insertEmployee(emp);
	}
	
	@Override
	public void getEmployees() throws ClassNotFoundException, SQLException {
		EmployeeDaoI dao = new EmployeeDaoImpl();
		
		dao.getEmployees();
		
	}

	@Override
	public void deleteEmployee(int did) throws ClassNotFoundException, SQLException {
		EmployeeDaoI dao = new EmployeeDaoImpl();
		
		dao.deleteEmployee(did);
		
	}

	@Override
	public void updateEmployee(int uid, Employee e) throws ClassNotFoundException, SQLException {
		EmployeeDaoI dao = new EmployeeDaoImpl();
		
		dao.updateEmployee(uid, e);
	}

}
