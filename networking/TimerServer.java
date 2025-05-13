package com.sangita.networking;

import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.time.LocalTime;

public class TimerServer {

	public static void main(String[] args) throws Exception {
		  	ServerSocket server = new ServerSocket(5000);
	        System.out.println("Server started. Waiting for client...");

	        Socket socket = server.accept();
	        System.out.println("Client connected.");
	        PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
	        
	        out.println("Current Time: " + LocalTime.now());
	        
	        socket.close();
	        server.close();
	        System.out.println("Server closed.");

	}

}
