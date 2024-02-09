package com.task.ui;

import java.sql.SQLException;
import java.util.Scanner;

import com.task.crud.bean.Employee;
import com.task.service.EmployeeServiceI;
import com.task.service.EmployeeServiceImpl;

public class UserInterface {
	
	

public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		do {
			System.out.println("\nCRUD APPLICATION !!!\n\n");
			System.out.println("Enter your option: \n");
			System.out.println("1. insert");
			System.out.println("2. select");
			System.out.println("3. delete");
			System.out.println("4. update");
			Scanner sc = new Scanner(System.in);
			int input = sc.nextInt();
			//sc.close();
			
			
			switch(input) {
			
			case 1:
				
				insertEmployee();
				break;
			
			case 2:
				
				getEmployees();
				break;
				
			case 3:
				
				deleteEmployee();
				break;
				
			case 4:
				
				updateEmployee();
				break;
				
			default: 
				System.out.println("Invalid input");
				break;
				
			}
			
			
		} while(true);
		
		
	}

public static void insertEmployee() throws ClassNotFoundException, SQLException {
	
	EmployeeServiceI es = new EmployeeServiceImpl();
	
	String name, address;
	
	Scanner s = new Scanner(System.in);
	System.out.println("Enter your Id: ");
	int id = s.nextInt();
	System.out.println("Enter your Name: ");
	name = s.next();
	System.out.println("Enter your Address: ");
	address = s.next();
	//s.close();
	
	Employee employee = new Employee(id, name, address);
	//System.out.println(employee.getEmpName()+" "+employee.getEmpAddress());	
	
	es.insertEmployee(employee);
	
}
public static void getEmployees() throws ClassNotFoundException, SQLException {
	
	EmployeeServiceI es = new EmployeeServiceImpl();
	es.getEmployees();
	
}
public static void deleteEmployee() throws ClassNotFoundException, SQLException {
	
	EmployeeServiceI es = new EmployeeServiceImpl();
	Scanner sd = new Scanner(System.in);
	System.out.println("Enter the Employee Id (you want to delete): ");
	int did = sd.nextInt();
	es.deleteEmployee(did);
	
}
public static void updateEmployee() throws ClassNotFoundException, SQLException {
	
	EmployeeServiceI es = new EmployeeServiceImpl();
	Scanner su = new Scanner(System.in);
	System.out.println("Enter the Employee Id (you want to update): ");
	int uid = su.nextInt();
	System.out.println("Enter New Name: ");
	String newName = su.next(); 
	System.out.println("Enter New Address: ");
	String newAddress = su.next();
	Employee e = new Employee(uid, newName, newAddress);
	es.updateEmployee(uid, e);
	
}

}
