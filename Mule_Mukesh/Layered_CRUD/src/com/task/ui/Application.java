package com.task.ui;
import java.sql.SQLException;
import java.util.*;
import com.task.bean.*;
import com.task.service.*;
public class Application 
{
	public static void main(String args[]) throws ClassNotFoundException, SQLException
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter your option");
		System.out.println("1.Insert");
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
			System.out.println("Invalid option");
			break;
		}
		}
	}

	private static void deleteEmployee() throws ClassNotFoundException, SQLException 
	{
		EmployeeServiceImplement esi=new EmployeeServiceImplement();
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter id of person whose details you want to delete");
		Employee emp=new Employee();
		emp.setEid(sc.nextInt());
		esi.deleteEmployee(emp);
	}

	private static void selectEmployee() throws ClassNotFoundException, SQLException 
	{
		EmployeeServiceImplement esi=new EmployeeServiceImplement();
		esi.selectEmployee();
	}

	private static void updateEmployee() throws ClassNotFoundException, SQLException 
	{
		EmployeeServiceImplement esi=new EmployeeServiceImplement();
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter the id of whose details you want to update");
		int eid=sc.nextInt();
		System.out.println("Please Enter the address value you want to update");
		String eaddress=sc.next();
		Employee emp=new Employee();
		emp.setEid(eid);
		emp.setEaddress(eaddress);
		esi.updateEmployee(emp);
	}

	private static void insertEmployee() throws ClassNotFoundException, SQLException 
	{
		EmployeeServiceImplement esi=new EmployeeServiceImplement();
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter id");
		int eid=sc.nextInt();
		System.out.println("Please enter ename");
		String ename=sc.next();
		System.out.println("Please enter eaddress");
		String eaddress=sc.next();
		Employee emp=new Employee();
		emp.setEid(eid);
		emp.setEaddress(eaddress);
		emp.setEname(ename);
		esi.insertEmployee(emp);
	}
}
