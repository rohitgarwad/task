package com.task.service;
import com.task.dao.*;
import java.sql.SQLException;
import com.task.bean.Employee;

public class EmployeeServiceImpl implements EmployeeServiceI{
	@Override
	public void insertEmployee(Employee emp)throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		EmployeeDaoI dao=new EmployeeDaoImpl();
		dao.insertEmployee(emp);
	}
}
