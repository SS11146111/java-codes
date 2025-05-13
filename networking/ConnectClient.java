package com.sangita.networking;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class ConnectClient {

	public static void main(String[] args) throws Exception{
		
		Socket socket = new Socket("localhost", 5000);

        BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
        BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));

        System.out.println("Connected to server");
        System.out.println("Enter username: ");
        String username = console.readLine();
        out.println(username);
 
        System.out.println("Enter password: ");
        String password = console.readLine();
        out.println(password);
        
        System.out.println(in.readLine());
        
        socket.close();
        System.out.println("Client closed.");


	}

}
