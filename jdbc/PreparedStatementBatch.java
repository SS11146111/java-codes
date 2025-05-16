package com.sangita.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PreparedStatementBatch {

	public static void main(String[] args) {
		

		try{  
			
			Connection con=DriverManager.getConnection(  
			"jdbc:mysql://localhost:3306/sangita","root","root");
			PreparedStatement pstmt=con.prepareStatement("Insert into users(username,password) Values(?,?)"); 
			con.setAutoCommit(false);
			
			pstmt.setString(1, "john_doe");
            pstmt.setString(2, "password123");
            pstmt.addBatch();

            pstmt.setString(1, "alice_smith");
            pstmt.setString(2, "alice123");
            pstmt.addBatch();

            pstmt.setString(1, "bob_jones");
            pstmt.setString(2, "bob123");
            pstmt.addBatch();

            pstmt.setString(1, "charlie_brown");
            pstmt.setString(2, "charlie2024");
            pstmt.addBatch();

            int[] rowsInserted = pstmt.executeBatch();

            con.commit();
            
            System.out.println("✅ Batch insert completed successfully.");
            System.out.println("Number of rows inserted: " + rowsInserted.length);
            
			con.close();
		}
		catch(SQLException e)
		{ System.out.println(e.getMessage());}  

	}

}
