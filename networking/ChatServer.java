package com.sangita.networking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class ChatServer {

	public static void main(String[] args) throws Exception {
		ServerSocket server = new ServerSocket(6000);
        System.out.println("Server started. Waiting for client...");

        Socket socket = server.accept();
        System.out.println("Client connected.");

        BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
        BufferedReader console = new BufferedReader(new InputStreamReader(System.in));       

        Thread receive = new Thread(() -> {
            String msg;
            try {
                while ((msg = in.readLine()) != null) {
                    System.out.println("Client: " + msg);
                    if (msg.equalsIgnoreCase("exit")) break;
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        });
        
        
     // Thread to send to client
        Thread send = new Thread(() -> {
            String msg;
            try {
                while (true) {
                    msg = console.readLine();
                    out.println(msg);
                    if (msg.equalsIgnoreCase("exit")) break;
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        });
        
        
        receive.start();
        send.start();
        
        receive.join();  // Wait for either thread to finish
        socket.close();
        server.close();
        System.out.println("Server closed.");
        
		
	}

}
