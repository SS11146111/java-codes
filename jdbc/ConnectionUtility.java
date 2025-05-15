package com.sangita.jdbc;
import java.sql.*;
class OpenCloseConnection {
	
	public static Connection getConnection(String databaseName, String userName, String passwordName) throws SQLException 
	{
		  String url = "jdbc:mysql://localhost:3306/"+databaseName; // Change DB name
		  String user = userName;
		  String password = passwordName;
		  return DriverManager.getConnection(url, user, password);	    	
	}
	 
	public static void closeConnection(Connection con) throws SQLException
	{
		con.close();
		System.out.println("Connection closed");
	}
	 
}


public class ConnectionUtility{
	
	public static void main(String args[])
	{
		Connection con = null;
		try {
			 con = OpenCloseConnection.getConnection("sangita", "root", "root");
			if(con!=null && !con.isClosed())
			{
				System.out.println("Connection established");
			}
			
		} catch (SQLException e) {
			
			System.out.println(e.getMessage());
		}
		finally {
			
			if(con!=null)
				try {
					OpenCloseConnection.closeConnection(con);
				} catch (SQLException e) {
					
					System.out.println(e.getMessage());
				}
		}
		
	}
}
