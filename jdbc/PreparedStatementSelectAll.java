package com.sangita.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PreparedStatementSelectAll {

	public static void main(String[] args) {
		
		String h1 = "Book Id";
		String h2 = "Title";
		String h3 = "Author";
		String h4 = "Genre";
		String h5 = "Price";
		String h6 = "Published Year";
		
		try{  
			
			Connection con=DriverManager.getConnection(  
			"jdbc:mysql://localhost:3306/sangita","root","root");
			PreparedStatement pstmt=con.prepareStatement("SELECT * from books where author = ?"); 
			pstmt.setString(1, "Stephen Hawking");
			
			ResultSet rows = pstmt.executeQuery();
			
			System.out.printf("%-10s %-40s %-30s %-20s %-10s %-10s%n", h1,h2,h3,h4,h5,h6);
			while(rows.next())
			{
				System.out.printf("%-10d %-40s %-30s %-20s %-10.2f %-10d%n", rows.getInt(1), rows.getString(2), rows.getString(3), rows.getString(4), rows.getDouble(5), rows.getInt(6));
			}
			con.close();
		}
		catch(SQLException e)
		{ System.out.println(e.getMessage());}  


	}

}
