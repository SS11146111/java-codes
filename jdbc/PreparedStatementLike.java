package com.sangita.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PreparedStatementLike {
	
	public static void main(String[] args) {
		
		String h1 = "Product Id";
		String h2 = "Product Name";
		String h3 = "Price";
		String h4 = "Stock";
		
		try{  
			
			Connection con=DriverManager.getConnection(  
			"jdbc:mysql://localhost:3306/sangita","root","root");
			PreparedStatement pstmt=con.prepareStatement("SELECT * from products where productName Like ?"); 
			pstmt.setString(1, "S%");
			ResultSet rows = pstmt.executeQuery();
			
			System.out.printf("%-20s %-20s %-10s %-10s%n", h1,h2,h3,h4);
			while(rows.next())
			{
				System.out.printf("%-20d %-20s %-10.2f %-10d%n", rows.getInt(1), rows.getString(2), rows.getDouble(3), rows.getInt(4));
			}
			con.close();
		}
		catch(SQLException e)
		{ System.out.println(e.getMessage());}  


	}

}
