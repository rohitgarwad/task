package com.task.da;
import java.sql.SQLException;

import com.task.bean.*;

public interface EmployeeDaol {

	public void insertEmployee(Employee emp) throws ClassNotFoundException, SQLException;

	public void updateEmployee(Employee emp) throws SQLException, ClassNotFoundException;

	public void deleteEmployee() throws SQLException, ClassNotFoundException;

	public void selectEmployee() throws SQLException, ClassNotFoundException;
}