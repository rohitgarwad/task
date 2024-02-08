package com.task.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.cj.jdbc.result.ResultSetMetaData;
import com.task.bean.*;
import com.task.util.*;

public class EmployeeDAOImplements implements EmployeeDAO 
{
	Connection connection=null;
	PreparedStatement pst=null;
	@Override
	public void insertEmployee(Employee emp) throws ClassNotFoundException, SQLException
	{
		int empid=emp.getEid();
		String empname=emp.getEname();
		String empadd=emp.getEaddress();
		connection=EmployeeUtil.getDBConnection();
		pst=connection.prepareStatement("insert into employee values(?,?,?)");
		pst.setString(1,empname);
		pst.setString(2,empadd);
		pst.setInt(3, empid);
		pst.executeUpdate();
		System.out.println("One record is inserted");
	}
	@Override
	public void updateEmployee(Employee emp) throws ClassNotFoundException, SQLException 
	{
		String empaddress=emp.getEaddress();
		int empid=emp.getEid();
		connection=EmployeeUtil.getDBConnection();
		pst=connection.prepareStatement("update employee set address=? where id=?");
		pst.setString(1,empaddress);
		pst.setInt(2,empid);
		pst.executeUpdate();
		System.out.println("record got updated");
	}
	public void selectEmployee() throws ClassNotFoundException, SQLException
	{
		connection=EmployeeUtil.getDBConnection();
		pst=connection.prepareStatement("select * from employee");
		ResultSet rs=pst.executeQuery();
		java.sql.ResultSetMetaData rsmd=rs.getMetaData();
		int cols=rsmd.getColumnCount();
		for(int i=1;i<=cols;i++)
		{
			System.out.print(rsmd.getColumnName(i)+"  ");
		}
		System.out.println();
		while(rs.next())
		{
			for(int i=1;i<=cols;i++)
			{
				System.out.print(rs.getString(i)+"  ");
			}
			System.out.println();
		}
		connection.close();
	}
	@Override
	public void deleteEmployee(Employee emp) throws ClassNotFoundException, SQLException 
	{
		int eid=emp.getEid();
		connection=EmployeeUtil.getDBConnection();
		pst=connection.prepareStatement("delete from employee where id=?");
		pst.setInt(1,eid);
		pst.executeUpdate();
		connection.close();
		System.out.println("Record deleted");
	}
}
