package com.sangita.networking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class ReverseServer {

	public static void main(String[] args) throws IOException {
	
		ServerSocket server = new ServerSocket(5000);
        System.out.println("Server started. Waiting for client...");

        Socket socket = server.accept();
        System.out.println("Client connected.");
        
        PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
        BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        
        String msg = in.readLine();
        StringBuilder sb = new StringBuilder();
        sb.append(msg);
        msg = sb.reverse().toString();
        out.println("Reversed string: " + msg);
            

        socket.close();
        server.close();
        System.out.println("Server closed.");

	}

}
