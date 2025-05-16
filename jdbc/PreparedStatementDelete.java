package com.sangita.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PreparedStatementDelete {

	public static void main(String args[])
	{
		try{  
			
			Connection con=DriverManager.getConnection(  
			"jdbc:mysql://localhost:3306/sangita","root","root");
			PreparedStatement pstmt=con.prepareStatement("DELETE FROM users WHERE username = ?"); 
			pstmt.setString(1,"johndoe");
		
			int rowsDeleted = pstmt.executeUpdate();
			if (rowsDeleted > 0) {
			    System.out.println("✅ Record deleted");
			}
			else
			{
				System.out.println("✅ Record not found");
			}
			con.close();
		}
		catch(SQLException e)
		{ System.out.println(e.getMessage());}  
	}
}
