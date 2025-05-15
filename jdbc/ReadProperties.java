package com.sangita.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ResourceBundle;

class Connect {

	public static Connection getConnection() throws SQLException
	{
		 ResourceBundle rd = ResourceBundle.getBundle("system");
		 String url = rd.getString("url").trim();
		 String user = rd.getString("userName").trim();
		 String password = rd.getString("password").trim();
		 return DriverManager.getConnection(url, user, password);
	}
	public static void closeConnection(Connection con) throws SQLException
	{
		con.close();
		System.out.println("Connection closed");
	}
}

public class ReadProperties{
	
	public static void main(String args[])
	{
		Connection con = null;
		try {
			 con = Connect.getConnection();
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
					Connect.closeConnection(con);
				} catch (SQLException e) {
					
					System.out.println(e.getMessage());
				}
		}
		
	}
}