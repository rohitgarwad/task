package com.task.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.task.bean.EmployeeBean;
import com.task.util.DB_Util;

public class EmployeeDaoImpl implements EmployeeDaoI {
    
    @Override
    public void insertEmployee(EmployeeBean bean) throws ClassNotFoundException, SQLException {
        try (Connection con = DB_Util.getDBConnection();
             PreparedStatement pst = con.prepareStatement("insert into emp2 values(?,?,?)")) {
            pst.setInt(1, bean.getEmpid());
            pst.setString(2, bean.getEmpname());
            pst.setString(3, bean.getEmpaddress());
            pst.executeUpdate();
            System.out.println("One record inserted successfully");
        }
    }

    @Override
    public void updateEmployee(EmployeeBean bean1) throws ClassNotFoundException, SQLException {
        try (Connection con = DB_Util.getDBConnection();
             PreparedStatement pst = con.prepareStatement("update emp2 set empname = ?, empaddress = ? where empid = ?")) {
            pst.setString(1, bean1.getEmpname());
            pst.setString(2, bean1.getEmpaddress());
            pst.setInt(3, bean1.getEmpid());
            pst.executeUpdate();
            System.out.println("One record updated successfully");
        }
    }

    @Override
    public void selectEmployee(EmployeeBean bean) throws ClassNotFoundException, SQLException {
        try (Connection con = DB_Util.getDBConnection();
             PreparedStatement pst = con.prepareStatement("select * from emp2")) {
            pst.executeQuery();
            System.out.println("Read the table successfully");
        }
    }

    @Override
    public void deleteEmployee(EmployeeBean bean) throws ClassNotFoundException, SQLException {
        try (Connection con = DB_Util.getDBConnection();
             PreparedStatement pst = con.prepareStatement("TRUNCATE TABLE emp2")) {
            pst.executeUpdate();
            System.out.println("All records deleted from emp2 table successfully");
        }
    }
}
