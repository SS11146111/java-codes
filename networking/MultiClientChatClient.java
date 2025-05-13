package com.sangita.networking;

import java.io.*;
import java.net.*;

public class MultiClientChatClient {
    public static void main(String[] args) throws Exception {
        Socket socket = new Socket("localhost", 6000);
        BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
        BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));

        System.out.println("Connected to chat server. Type 'exit' to quit.");

        // Thread to receive messages
        Thread receive = new Thread(() -> {
            String msg;
            try {
                while ((msg = in.readLine()) != null) {
                    System.out.println(msg);
                }
            } catch (IOException e) {
                System.out.println("Disconnected from server.");
            }
        });

        // Thread to send messages
        Thread send = new Thread(() -> {
            String msg;
            try {
                while ((msg = console.readLine()) != null) {
                    out.println(msg);
                    if (msg.equalsIgnoreCase("exit")) break;
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        });

        receive.start();
        send.start();

        receive.join(); // wait until client quits
        socket.close();
        System.out.println("Client closed.");
    }
}

