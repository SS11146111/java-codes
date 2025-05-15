package com.sangita.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class CustomConnectionHandler {

    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/sangita?useSSL=false&serverTimezone=UTC";
        String user = "root";
        String password = "root";

        Connection con = null;

        try {
            con = DriverManager.getConnection(url, user, password);
            System.out.println("✅ Connection successful!");

        } catch (SQLException e) {
            // Custom error message
            System.out.println("❌ Failed to connect to the database.");
            System.out.println("Reason: " + e.getMessage());

            // Optional: Debug info
            System.out.println("SQL State: " + e.getSQLState());
            System.out.println("Error Code: " + e.getErrorCode());

        } finally {
            // Always attempt to close the connection
            if (con != null) {
                try {
                    con.close();
                    System.out.println("🔒 Connection closed.");
                } catch (SQLException e) {
                    System.out.println("❌ Error while closing the connection: " + e.getMessage());
                }
            }
        }
    }
}

