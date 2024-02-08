package com.task.dao;

import java.sql.SQLException;

import com.task.bean.EmployeeBean;

public interface EmployeeDaoI {
	 // Method to insert an employee
    public void insertEmployee(EmployeeBean bean) throws ClassNotFoundException, SQLException;
    // Method to update an employee
    public void updateEmployee(EmployeeBean bean) throws ClassNotFoundException, SQLException;
    // Method to select an employee
    public void selectEmployee(EmployeeBean bean) throws ClassNotFoundException, SQLException;
    // Method to delete an employee
    public void deleteEmployee(EmployeeBean bean) throws ClassNotFoundException, SQLException;

	
}