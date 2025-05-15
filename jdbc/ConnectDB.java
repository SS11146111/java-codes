package com.sangita.jdbc;
import java.sql.*;  
public class ConnectDB {

	public static void main(String[] args) 
	{
		String h1 = "Customer Id";
		String h2 = "Name";
		String h3 = "Email";
		String h4 = "Created At";
		
		try{  
			Class.forName("com.mysql.jdbc.Driver");  
			Connection con=DriverManager.getConnection(  
			"jdbc:mysql://localhost:3306/sangita","root","root");
			Statement stmt=con.createStatement();  
			ResultSet rs=stmt.executeQuery("select * from customers");  
			System.out.printf("%-15s %-20s %-30s %-15s%n", h1,h2,h3,h4);
			while(rs.next())  
				System.out.printf("%-15d %-20s %-30s %-15s%n", rs.getInt(1), rs.getString(2), rs.getString(3), rs.getDate(4));
				con.close();  
			}
		catch(Exception e)
		{ System.out.println(e);}  
	}  	
}

