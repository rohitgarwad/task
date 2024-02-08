package com.task.service;
import java.sql.SQLException;

import com.task.bean.*;
public interface EmployeeServiceI {
	void insertEmployee(Employee emp) throws ClassNotFoundException, SQLException;
	void updateEmployee(Employee emp) throws ClassNotFoundException, SQLException;
	void selectEmployee() throws   ClassNotFoundException, SQLException;
	void deleteEmployee() throws ClassNotFoundException, SQLException;

}