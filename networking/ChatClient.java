package com.sangita.networking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class ChatClient {

	public static void main(String[] args) throws Exception
	{
		Socket socket = new Socket("localhost", 6000);

        BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
        BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));

        System.out.println("Connected to server");

        Thread receive = new Thread(() -> {
            String msg;
            try {
                while ((msg = in.readLine()) != null) {
                    System.out.println("Server: " + msg);
                    if (msg.equalsIgnoreCase("exit")) break;
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        });

        // Thread to send to server
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

        receive.join();
        socket.close();
        System.out.println("Client closed.");

	}

}
