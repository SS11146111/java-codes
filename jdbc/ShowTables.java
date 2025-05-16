package com.sangita.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ShowTables {

	public static void main(String[] args) {
		
		try{  
			
			Connection con=DriverManager.getConnection(  
			"jdbc:mysql://localhost:3306/sangita","root","root");
			Statement stmt=con.createStatement();  
			String sql = "SHOW tables";
			ResultSet rs = stmt.executeQuery(sql);
			System.out.println("All Tables List");
			while(rs.next())
			{
				System.out.println(rs.getString(1));
			}
			con.close();
		}
		catch(SQLException e)
		{ System.out.println(e.getMessage());}


	}

}
