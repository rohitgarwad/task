package com.task.service;
import java.sql.SQLException;

import com.task.bean.*;
import com.task.dao.*;

public class EmployeeServiceImplement implements EmployeeService
{
	@Override
	public void insertEmployee(Employee emp) throws ClassNotFoundException, SQLException
	{
		EmployeeDAOImplements dao=new EmployeeDAOImplements();
		dao.insertEmployee(emp);
	}
	public void updateEmployee(Employee emp) throws ClassNotFoundException, SQLException
	{
		EmployeeDAOImplements dao=new EmployeeDAOImplements();
		dao.updateEmployee(emp);
	}
	@Override
	public void selectEmployee() throws ClassNotFoundException, SQLException 
	{
		EmployeeDAOImplements dao=new EmployeeDAOImplements();
		dao.selectEmployee();
	}
	public void deleteEmployee(Employee emp) throws ClassNotFoundException, SQLException 
	{
		EmployeeDAOImplements dao=new EmployeeDAOImplements();
		dao.deleteEmployee(emp);
	}
}
