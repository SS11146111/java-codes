package com.sangita.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertRecord {

	public static void main(String[] args) {
		
		try{  
			
			Connection con=DriverManager.getConnection(  
			"jdbc:mysql://localhost:3306/sangita","root","root");
			Statement stmt=con.createStatement();  
			String sql = "INSERT INTO employees (emp_name, department, salary, hire_date) VALUES ('Steve Rogers', 'IT', 60000.00, '2025-05-14')";
			int rowsInserted = stmt.executeUpdate(sql);
			if (rowsInserted > 0) {
			    System.out.println("✅ A new employee was inserted successfully.");
			}
		}
		catch(SQLException e)
		{ System.out.println(e.getMessage());}  
	}

}
