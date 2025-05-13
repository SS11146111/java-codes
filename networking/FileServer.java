package com.sangita.networking;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class FileServer {

	public static void main(String[] args) throws Exception {
		        ServerSocket serverSocket = new ServerSocket(7000);
		        System.out.println("Server started. Waiting for file...");

		        Socket socket = serverSocket.accept();
		        BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
		        PrintWriter fileOut = new PrintWriter("C:\\Users\\User\\eclipse-workspace\\practice_codes\\codes\\src\\com\\sangita\\networking\\test2.txt");

		        String line;
		        while ((line = in.readLine()) != null) {
		            if (line.equals("EOF")) break;
		            fileOut.println(line);
		        }

		        System.out.println("File received.");
		        fileOut.close();
		        socket.close();
		        serverSocket.close();
		    }


	}

