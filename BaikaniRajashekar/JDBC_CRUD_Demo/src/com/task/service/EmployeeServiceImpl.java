package com.task.service;

import java.sql.SQLException;

import com.task.bean.EmployeeBean;
import com.task.dao.EmployeeDaoImpl;

public class EmployeeServiceImpl implements EmployeeServiceI {


    @Override
    public void insertEmployee(EmployeeBean bean) throws ClassNotFoundException, SQLException {
        EmployeeDaoImpl dao = new EmployeeDaoImpl();
        dao.insertEmployee(bean);
    }

    @Override
    public void updateEmployee(EmployeeBean bean) throws ClassNotFoundException, SQLException {
        EmployeeDaoImpl dao = new EmployeeDaoImpl();
        dao.updateEmployee(bean);
    }

    @Override
    public void selectEmployee(EmployeeBean bean) throws ClassNotFoundException, SQLException {
        EmployeeDaoImpl dao = new EmployeeDaoImpl();
        dao.selectEmployee(bean);
    }

	@Override
	public void deleteEmployee(EmployeeBean bean) throws ClassNotFoundException, SQLException {
		 EmployeeDaoImpl dao = new EmployeeDaoImpl();
	        dao.deleteEmployee(null); // Assuming you have a method to delete all employees in your DAO
	    }
}
