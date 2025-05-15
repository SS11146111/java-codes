package com.sangita.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class CountAll {

	public static void main(String[] args) {
		
		try{  
			
			Connection con=DriverManager.getConnection(  
			"jdbc:mysql://localhost:3306/sangita","root","root");
			Statement stmt=con.createStatement();  
			String sql = "select count(*) from products";
			ResultSet rs = stmt.executeQuery(sql);
			if (rs.next()) 
			{
		         System.out.println("Total rows in products table: " + rs.getInt(1));
		    }
		}
		catch(SQLException e)
		{ System.out.println(e.getMessage());}


	}

}
