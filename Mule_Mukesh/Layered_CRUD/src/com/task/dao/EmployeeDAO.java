package com.task.dao;
import java.sql.SQLException;

import com.task.bean.*;
public interface EmployeeDAO 
{
	public void insertEmployee(Employee emp) throws ClassNotFoundException, SQLException;
	public void updateEmployee(Employee emp) throws ClassNotFoundException, SQLException;
	public void selectEmployee() throws ClassNotFoundException, SQLException;
	public void deleteEmployee(Employee emp) throws ClassNotFoundException, SQLException;
}
