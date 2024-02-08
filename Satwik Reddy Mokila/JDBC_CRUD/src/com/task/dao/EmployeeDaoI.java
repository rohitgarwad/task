package com.task.dao;
import java.sql.SQLException;

import com.task.bean.*;
public interface EmployeeDaoI {
	public void insertEmployee(Employee emp) throws ClassNotFoundException,SQLException;
	public void gtEmployee(int id,String choice,String nw) throws ClassNotFoundException, SQLException;	
	public void selectEmp() throws ClassNotFoundException, SQLException;
	public void del() throws ClassNotFoundException, SQLException;
	}
