package com.task.util;
import java.sql.*;
public class EmployeeUtil {
		public static String url="jdbc:mysql://localhost:3306/jdbc";
		public static String username = "root";
		public static String password = "root";
		public static Connection connection = null;
		public static Connection getDBConnection() throws ClassNotFoundException,SQLException{
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection(url,username,password);
			return connection;
		}
		public static Connection getDBDestroyConnection() throws SQLException {
			connection.close();
			return null
					;
		}

	}
