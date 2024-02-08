package com.task.da;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.task.bean.Employee;
import com.task.util.*;

public class EmployeeDaolmpl implements EmployeeDaol{
   public static Connection connection;
   public static PreparedStatement pst;
	public void insertEmployee(Employee emp) throws ClassNotFoundException, SQLException
	{
		 String empname=emp.getEmpName();
		 String empaddress=emp.getEmpAddress();
		 connection=EmployeeUtil.getDBConnection();
		 
		 pst=connection.prepareStatement("insert into employee values(?,?)");
		 pst.setString(1,empname);
		 pst.setString(2,empaddress);
		 pst.executeUpdate();
		 System.out.println("One record is inserted ");
		   
	}
	@Override
	public void updateEmployee(Employee emp) throws SQLException, ClassNotFoundException
	{		
	    String empName=emp.getEmpName();
	    String empAddress=emp.getEmpAddress();
	    connection=EmployeeUtil.getDBConnection();
		pst=connection.prepareStatement("update employee set empname=? where empaddress=?");
		pst.setString(1, empName);
		pst.setString(2, empAddress);
		pst.executeUpdate();
		System.out.println("one record updated successfully");
		
		
	}
	@Override
	public void selectEmployee() throws SQLException, ClassNotFoundException
	{
		 String selectQuery = "SELECT * FROM employee";
		 connection=EmployeeUtil.getDBConnection();
		 pst=connection.prepareStatement(selectQuery);
		    ResultSet resultSet = pst.executeQuery();
		    System.out.println("empName\t\tempaddress");

		    
		    while (resultSet.next()) {
		        String empname = resultSet.getString("empName");
		        String empaddress = resultSet.getString("empAddress");
		      
		        System.out.println(empname + "\t\t" + empaddress);
		    }

		    resultSet.close();
	}
	@Override
	public void deleteEmployee() throws SQLException, ClassNotFoundException 
	{
	    String deleteQuery = "DELETE FROM employee";

	    connection = EmployeeUtil.getDBConnection();
	    pst = connection.prepareStatement(deleteQuery);
	    pst.executeUpdate();
	    pst.close();
	    connection.close();
	}
		
	}
		
