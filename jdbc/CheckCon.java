package com.sangita.jdbc;
import java.sql.*;  
public class CheckCon {

	public static void main(String[] args) throws ClassNotFoundException {
		
		try{  
			Class.forName("com.mysql.jdbc.Driver");  
			Connection con=DriverManager.getConnection(  
			"jdbc:mysql://localhost:3306/sangita","root","root");
			if (isConnectionOpen(con)) {
                System.out.println("Connection is OPEN.");
            } else {
                System.out.println("Connection is CLOSED.");
            }
            con.close(); 
		}catch(SQLException e)
		{
			System.out.println(e.getMessage());
		}
	}

	  public static boolean isConnectionOpen(Connection conn) {
	        try {
	            return conn != null && !conn.isClosed();
	        } catch (SQLException e) {
	            System.err.println("Error checking connection status: " + e.getMessage());
	            return false;
	        }
	    }
}
