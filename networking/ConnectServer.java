package com.sangita.networking;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.*;

public class ConnectServer {

	public static void main(String[] args) throws Exception{
		
			Map<String, String> map = new HashMap<String, String>();
		
			map.put("Sangita", "Accio");
			map.put("Puneet", "Alohamora");
			map.put("Vineet", "Nonsense");
		
		 	ServerSocket server = new ServerSocket(5000);
	        System.out.println("Server started. Waiting for client...");

	        Socket socket = server.accept();
	        System.out.println("Client connected.");
	        
	        BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
	        PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
	        
	        String username, password;
	        boolean flag = false;
	        
	        username = in.readLine();
	        password = in.readLine();
	        
	        for(Map.Entry<String,String> m : map.entrySet())
	        {
	        	if(m.getKey().equals(username) && m.getValue().equals(password))
	        	{
	        		out.println("Connection successful!!!");
	        		flag = true;
	                break;
	        	}
	 
	        }
	        
	        if(flag==false)
	        {
	        	out.println("Invalid credentials");
	        }
	        
	        socket.close();
	        server.close();
	        System.out.println("Server closed.");
		
	}

}
