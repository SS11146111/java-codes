package com.sangita.networking;

import java.io.*;
import java.net.*;
import java.nio.file.*;

public class FileClient {

	public static void main(String[] args) throws Exception {
		
		  Socket socket = new Socket("localhost", 7000);
	      System.out.println("Connected to server. Sending file...");

	       // Read entire file as text
	      String fileContent = Files.readString(Path.of("C:\\Users\\User\\eclipse-workspace\\practice_codes\\codes\\src\\com\\sangita\\networking\\test1.txt"));

	      PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
	      out.println(fileContent);
	      out.println("EOF");
	      
	      System.out.println("File sent.");
	      socket.close();
	}

}
