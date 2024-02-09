package com.task.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.task.crud.bean.Employee;
import com.task.util.EmployeeUtil;

public class EmployeeDaoImpl implements EmployeeDaoI{

	public static Connection connection = null;
	public static PreparedStatement pst = null;
	
	@Override
	public void insertEmployee(Employee emp) throws ClassNotFoundException, SQLException {
		
		int empid = emp.getEmpId();
		String empname = emp.getEmpName();
		String empaddress = emp.getEmpAddress();
		
		//System.out.println(empname+" "+empaddress);
		
		connection = EmployeeUtil.getDBConnection();
		
		pst = connection.prepareStatement("insert into employee values (?,?,?)");
		pst.setInt(1, empid);
		pst.setString(2, empname);
		pst.setString(3, empaddress);
		pst.executeUpdate();
		System.out.println("\nOne record is inserted");
		EmployeeUtil.getDBDestroyConnection();
	}
	
	public void getEmployees() throws ClassNotFoundException, SQLException {
		
		connection = EmployeeUtil.getDBConnection();
		
		pst = connection.prepareStatement("select * from employee");
		
		ResultSet rs = pst.executeQuery();
		
		int id;
		String name = null, address = null;
		
		while(rs.next()) {
			id = rs.getInt(1);
			name = rs.getString(2);
			address = rs.getString(3);
			System.out.println(id+" "+name+ " "+address);
			new Employee(id, name, address);
		}
				
		System.out.println("\nData Fetched! ");
		EmployeeUtil.getDBDestroyConnection();
		
	}

	@Override
	public void deleteEmployee(int did) throws ClassNotFoundException, SQLException {
		
		connection = EmployeeUtil.getDBConnection();
		
		pst = connection.prepareStatement("delete from employee where empId="+did);
		
		pst.executeUpdate();
		
				
		System.out.println("\nData Deleted ! ");
		EmployeeUtil.getDBDestroyConnection();
		
	}

	@Override
	public void updateEmployee(int uid, Employee e) throws ClassNotFoundException, SQLException {
		
		connection = EmployeeUtil.getDBConnection();
		
		pst = connection.prepareStatement("update employee set empName='"+e.getEmpName()+"',empAddress='"+e.getEmpAddress()+"' where empId="+uid);
		
		pst.executeUpdate();
		
				
		System.out.println("\nData Updated ! ");
		EmployeeUtil.getDBDestroyConnection();
		
	}


}
