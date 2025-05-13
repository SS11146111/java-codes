package com.sangita.networking;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.Socket;


public class TimerClient {

	public static void main(String[] args) throws Exception{
			Socket socket = new Socket("localhost", 5000);
			System.out.println("Connected to serve..");
			BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			
			System.out.println(in.readLine());
			
			socket.close();
		    System.out.println("Client closed.");
	}

}
