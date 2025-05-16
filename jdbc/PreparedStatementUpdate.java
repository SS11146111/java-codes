package com.sangita.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PreparedStatementUpdate {

	public static void main(String[] args) {
		
		
		try{  
			
			Connection con=DriverManager.getConnection(  
			"jdbc:mysql://localhost:3306/sangita","root","root");
			PreparedStatement pstmt=con.prepareStatement("Update employees Set salary = salary+2000 where emp_id = ?"); 
			pstmt.setInt(1,4);
		
			int rowsUpdated = pstmt.executeUpdate();
			if (rowsUpdated > 0) {
			    System.out.println("✅ Salary updated.");
			}
			con.close();
		}
		catch(SQLException e)
		{ System.out.println(e.getMessage());}  

	}

}
