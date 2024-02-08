package com.task.service;
import com.task.da.*;

import java.sql.SQLException;

import com.task.bean.Employee;

public class EmployeeServiceImpl implements EmployeeServiceI{

	@Override
	public void insertEmployee(Employee emp) throws ClassNotFoundException, SQLException {
		EmployeeDaol dao=new EmployeeDaolmpl();
		dao.insertEmployee(emp);
	}

	@Override
	public void updateEmployee(Employee emp) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		EmployeeDaolmpl dao1=new EmployeeDaolmpl();
		dao1.updateEmployee(emp);
		
	}

	
	

	public void selectEmployee() throws SQLException, ClassNotFoundException 
	{
		EmployeeDaolmpl dao2=new EmployeeDaolmpl();
		dao2.selectEmployee();
	}

	public void deleteEmployee() throws ClassNotFoundException, SQLException
	{
		EmployeeDaolmpl dao3=new EmployeeDaolmpl();
		dao3.deleteEmployee();
	}


		
	
}
