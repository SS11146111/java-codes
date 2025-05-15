package com.sangita.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DeleteRecord {

	public static void main(String[] args) {
	
		try{  
			
			Connection con=DriverManager.getConnection(  
			"jdbc:mysql://localhost:3306/sangita","root","root");
			Statement stmt=con.createStatement();  
			String sql1 = "DELETE FROM orderDetails where orderId = 11";
			String sql2 = "DELETE FROM orders where orderId = 11";
			int rowsDeleted = stmt.executeUpdate(sql1);
			if (rowsDeleted > 0) {
			    rowsDeleted = stmt.executeUpdate(sql2);
			   if(rowsDeleted > 0)
			   {
				   System.out.println("✅Record deleted successfully.");
			   }
			}
		}
		catch(SQLException e)
		{ System.out.println(e.getMessage());} 
	}

}
