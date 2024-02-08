package com.task.ui;
import java.sql.SQLException;
import java.util.Scanner;
import com.task.service.*;
import com.task.bean.*;
import com.task.dao.EmployeeDaoI;
import com.task.dao.EmployeeDaoImpl;
public class Demo {
	@SuppressWarnings("resource")
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Scanner sc = new Scanner(System.in);
		System.out.println("select your option:");
		System.out.println("1. Insert employee data");
		System.out.println("2. Update employee data");
		System.out.println("3. Select employee data");
		System.out.println("4. Delete employee data");
		int option = sc.nextInt();
		switch(option){
		case 1:
		{
			insertEmp();
			break;
		}
		case 2:
		{	getEmp();
			break;
		}
		case 3:
		{	selectEmp();
			break;
		}
		case 4:
		{ delete();
			break;
		}
		}
		
	}
	@SuppressWarnings("resource")
	private static void insertEmp() throws ClassNotFoundException, SQLException {
		EmployeeServiceImpl service = new EmployeeServiceImpl();
		Employee bean = new Employee();
		System.out.println("Please enter below details in their respective order");
		System.out.println("enter employee ID:");
		System.out.println("enter employee Name:");
		System.out.println("enter employee Address:");
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		String name =sc.next();
		String add = sc.next();
		bean.setEmpid(i);
		bean.setEmpName(name);
		bean.setEmpAddress(add);
		service.insertEmployee(bean);
	}
	@SuppressWarnings("resource")
	private static void getEmp() throws ClassNotFoundException, SQLException {
		System.out.println("Enter ID:");
		Scanner sc = new Scanner(System.in);
		int eid= sc.nextInt();
		System.out.println("To modify Name Enter:1");
		System.out.println("OR");
		System.out.println("To modify Address Enter:2");
		int choice = sc.nextInt();
		System.out.println("Enter New data:");
		String nw=sc.next();
		String str;
		if(choice==1) {
			str="empname";
		}
		else {
			str="empaddress";
		}
		EmployeeDaoI dao=new EmployeeDaoImpl();
		dao.gtEmployee(eid,str,nw);
		System.out.println("data updated");
		
		
	}
	public static void selectEmp() throws ClassNotFoundException, SQLException {
		EmployeeDaoI dao=new EmployeeDaoImpl();
		dao.selectEmp();
	}
	public static void delete() throws ClassNotFoundException, SQLException {
		EmployeeDaoI dao=new EmployeeDaoImpl();
		System.out.println("To Delete all Table Data Enter:1");
		System.out.println("To Delete Row by EmpId Enter:2");
		System.out.println("To Delete Row by Empname Enter:3");
		System.out.println("To Delete Row by EmpAddress Enter:4");
		dao.del();
		
		
	}
}
