package com.task.util;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.task.bean.*;
public class EmployeeUtil 
{
	public static String url="jdbc:mysql://localhost:3306/testdb";
	public static String username="root";
	public static String password="root";
	public static Connection connection=null;
	public static Connection getDBConnection() throws ClassNotFoundException, SQLException
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		connection=DriverManager.getConnection(url,username,password);
		return connection;
	}
	public static void destroyConnection() throws SQLException
	{
		connection.close();
	}
}
