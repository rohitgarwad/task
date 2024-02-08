package com.task3;
import com.task.service.*;
import com.task.bean.*;

import java.sql.SQLException;
import java.util.Scanner;

public class Applications
{
	public static void main(String args[]) throws  SQLException, ClassNotFoundException 
	{
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your option");
		System.out.println("1.insert");
		System.out.println("2.Update");
		System.out.println("3.Select");
		System.out.println("4.Delete");
		int option=sc.nextInt();
		switch(option)
		{
		case 1:
			{
				insertEmployee();
				break;
			}
		
		case 2:
			{
				updateEmployee();
				break;
			}
		
		case 3:
			{
				selectEmployee();
				break;
			}
		
		case 4:
			{
				deleteEmployee();
				break;
			}
		default:
			{
				System.out.println("option  selected is not present");
			}
		
		
		}
		
		
	}

	

	private static void insertEmployee() throws ClassNotFoundException, SQLException 
	{
		EmployeeServiceImpl service=new EmployeeServiceImpl();
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		System.out.println("enter employee name");
		String name=sc.nextLine();
		System.out.println("enter employee address");
		String address= sc.nextLine();
		Employee emp=new Employee();
		emp.setEmpName(name);
		emp.setEmpAddress(address);
		service.insertEmployee(emp);
		
	}
	private static void updateEmployee() throws ClassNotFoundException, SQLException
	{
		EmployeeServiceImpl service1=new EmployeeServiceImpl();
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		System.out.println("enter employee name");
		String name=sc.nextLine();
		Employee emp=new Employee();
		emp.setEmpName(name);
		emp.setEmpAddress("Erraguntapally");
		service1.updateEmployee(emp);
	}
	private static void selectEmployee() throws SQLException, ClassNotFoundException
	{
		EmployeeServiceImpl service=new EmployeeServiceImpl();
		service.selectEmployee();
	}
	
	private static void deleteEmployee() throws ClassNotFoundException, SQLException
	{
		EmployeeServiceImpl service=new EmployeeServiceImpl();
		service.deleteEmployee();
		System.out.println("deleted table data");
		
	}

}


