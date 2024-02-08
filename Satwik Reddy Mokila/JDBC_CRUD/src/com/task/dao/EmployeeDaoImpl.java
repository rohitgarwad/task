package com.task.dao;
import java.beans.Statement;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Scanner;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.task.bean.Employee;
import com.task.util.*;
@SuppressWarnings("unused")
public class EmployeeDaoImpl implements EmployeeDaoI {
	public static Connection connection=null;
	public static PreparedStatement pst=null;
	@Override
	public void insertEmployee(Employee emp) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		int empid= emp.getEmpid();
		String empname=emp.getEmpName();
		String empaddress = emp.getEmpAddress();
		connection = EmployeeUtil.getDBConnection();
		pst=connection.prepareStatement("insert into emp values(?,?,?)");
		pst.setInt(1, empid);
		pst.setString(2,empname);
		pst.setString(3,empaddress);
		pst.executeUpdate();
		System.out.println("one record is inserted");
	}
	@Override
	public void gtEmployee(int id, String choice, String nw) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		connection = EmployeeUtil.getDBConnection();
		java.sql.Statement st = connection.createStatement();
		st.execute("update emp set "+choice+"="+"'"+nw+"'"+" "+"where"+" "+"empid="+id);
		
	}
	@Override
	public void selectEmp() throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		connection = EmployeeUtil.getDBConnection();
		java.sql.Statement st = connection.createStatement();
		ResultSet rs=st.executeQuery("select * from emp");
		System.out.println("EmpID:    EmpName:    EmpAddress:");
		while(rs.next()) {
			System.out.println(rs.getInt(1)+"       "+rs.getNString(2)+"      "+rs.getNString(3));
		}
		
	}
	@Override
	public void del() throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		connection = EmployeeUtil.getDBConnection();
		java.sql.Statement st = connection.createStatement();
		switch(a) {
		case 1:{
			st.execute("delete from emp");
			System.out.println("deleted data from table");
			break;
		}
		case 2:{
			System.out.println("enter EmpID:");
			int n = sc.nextInt();
			st.execute("delete from emp where empid="+n);
			
			System.out.println("deleted data from table");
			break;
		}
		case 3:{
			System.out.println("enter EmpName:");
			String n = sc.next();
			st.execute("delete from emp where empname="+n);
			System.out.println("deleted data from table");
			break;
		}
		case 4:{
			System.out.println("enter EmpAddress:");
			String n = sc.next();
			st.execute("delete from emp where empaddress="+n);
			System.out.println("deleted data from table");
			break;
		}
		
		}
		
	}
	
	
}
