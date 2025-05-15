package com.sangita.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateRecord {

	public static void main(String[] args) {
		
		try{  
			
			Connection con=DriverManager.getConnection(  
			"jdbc:mysql://localhost:3306/sangita","root","root");
			Statement stmt=con.createStatement();  
			String sql = "UPDATE customers SET email = 'charlieLee@example.com' WHERE customerId = 3";
			int rowsUpdated = stmt.executeUpdate(sql);
			if (rowsUpdated > 0) {
			    System.out.println("✅ Record updated successfully");
			}
		}
		catch(SQLException e)
		{ System.out.println(e.getMessage());}

	}

}
