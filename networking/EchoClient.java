package com.sangita.networking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class EchoClient {
	
	 public static void main(String[] args) throws IOException {
	        Socket socket = new Socket("localhost", 5000);

	        BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
	        PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
	        BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));

	        System.out.println("Connected to server. Type a message:");

	        String msg;
	        while ((msg = console.readLine()) != null) {
	            out.println(msg);
	            System.out.println(in.readLine());
	            if (msg.equalsIgnoreCase("exit")) break;
	        }

	        socket.close();
	        System.out.println("Client closed.");
	    }

}
