package com.task.ui;
import com.task.service.*;
import com.task.bean.*;

import java.sql.SQLException;
import java.util.Scanner;

public class Demo_CRUD {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Scanner sc = new Scanner(System.in);
		System.out.println("select ur option");
		System.out.println("option 1: insert employee data");//create
		System.out.println("option 2: update employee data");//update
		System.out.println("option 3: select employee data");//read
		System.out.println("option 4: delete employee data");//delete
		
		int option = sc.nextInt();
		switch(option){
			case 1:{
				insertEmployee();
				break;
			}
			case 2:{
				updateEmployee();	
				break;
			}
			case 3:{
				selectEmployee();
					
				break;
			}
			case 4:{
				deleteEmployee();
					
				break;
			}
			default :{
				System.out.println("invalid option");
			}
		}
	}

	private static void  insertEmployee() throws ClassNotFoundException, SQLException {
		EmployeeServiceImpl service = new EmployeeServiceImpl();
		EmployeeBean bean = new EmployeeBean();
		bean.setEmpid(23);
		bean.setEmpname("shekar");
		bean.setEmpaddress("hyderabad");
		service.insertEmployee(bean);
	}
	
	private static void updateEmployee() throws ClassNotFoundException, SQLException {
		EmployeeServiceImpl service = new EmployeeServiceImpl();
		EmployeeBean bean21 = new EmployeeBean();
		bean21.setEmpid(23);
		bean21.setEmpname("rajashekar");
		bean21.setEmpaddress("masab tank");
		service.updateEmployee(bean21);
	}
	private static void selectEmployee() throws ClassNotFoundException, SQLException {
		EmployeeServiceImpl service = new EmployeeServiceImpl();
		service.selectEmployee(null); // Assuming selectEmployee() doesn't need any parameters
	}
	
	private static void deleteEmployee() throws ClassNotFoundException, SQLException {
	    EmployeeServiceImpl service = new EmployeeServiceImpl();
	    service.deleteEmployee(null);
	}
}
