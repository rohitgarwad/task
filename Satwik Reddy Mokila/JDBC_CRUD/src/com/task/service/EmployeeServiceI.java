package com.task.service;
import java.sql.SQLException;
import com.task.bean.Employee;

public interface EmployeeServiceI {
	void insertEmployee(Employee emp) throws ClassNotFoundException, SQLException;
}
