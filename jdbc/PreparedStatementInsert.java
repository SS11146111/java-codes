package com.sangita.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PreparedStatementInsert {

	public static void main(String[] args) {
		
		
		try{  
			
			Connection con=DriverManager.getConnection(  
			"jdbc:mysql://localhost:3306/sangita","root","root");
			PreparedStatement pstmt=con.prepareStatement("Insert into students Values(?,?,?)"); 
			pstmt.setInt(1,112);
			pstmt.setString(2, "Sangita Saha");
			pstmt.setString(3, "A");
			int rowsInserted = pstmt.executeUpdate();
			if (rowsInserted > 0) {
			    System.out.println("✅ A new student was inserted successfully.");
			}
			con.close();
		}
		catch(SQLException e)
		{ System.out.println(e.getMessage());}  

	}

}
