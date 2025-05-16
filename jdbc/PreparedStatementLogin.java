package com.sangita.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class PreparedStatementLogin {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter usrename: ");
		String username = sc.next();
		System.out.print("Enter password: ");
		String password = sc.next();
		sc.close();
		
		try{  
			
			Connection con=DriverManager.getConnection(  
			"jdbc:mysql://localhost:3306/sangita","root","root");
			PreparedStatement pstmt=con.prepareStatement("SELECT * from users where username = ? and password = ?"); 
			pstmt.setString(1, username);
			pstmt.setString(2, password);
			
			ResultSet rows = pstmt.executeQuery();
	
			if(rows.next())
			{
				System.out.println("Welcome, you have logged in successfully");
			}
			else
			{
				System.out.println("Invalid Credentials");
			}

			con.close();
		}
		catch(SQLException e)
		{ System.out.println(e.getMessage());}

	}

}
