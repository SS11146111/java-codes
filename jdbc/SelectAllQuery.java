package com.sangita.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SelectAllQuery {

	public static void main(String[] args) 
	{
		String h1 = "Employee Id";
		String h2 = "Name";
		String h3 = "Department";
		String h4 = "Salary";
		String h5 = "Hired Date";
		
		try{  
			
			Connection con=DriverManager.getConnection(  
			"jdbc:mysql://localhost:3306/sangita","root","root");
			Statement stmt=con.createStatement();  
			ResultSet rs=stmt.executeQuery("select * from employees");  
			System.out.printf("%-15s %-20s %-20s %-20s %-10s%n", h1,h2,h3,h4,h5);
			while(rs.next())  
				System.out.printf("%-15d %-20s %-20s %-20f %-10s%n", rs.getInt(1), rs.getString(2), rs.getString(3), rs.getDouble(4), rs.getDate(5));
				con.close();  
			}
		catch(SQLException e)
		{ System.out.println(e.getMessage());}  
	}  	
}
