package com.sangita.networking;
import java.io.*;
import java.net.*;
import java.util.*;

public class MultiClientChatServer {

	 private static Set<PrintWriter> clientWriters = Collections.synchronizedSet(new HashSet<>());

	    public static void main(String[] args) throws IOException {
	        ServerSocket serverSocket = new ServerSocket(6000);
	        System.out.println("Server started on port 6000...");

	        while (true) {
	            Socket clientSocket = serverSocket.accept();
	            System.out.println("New client connected: " + clientSocket);

	            ClientHandler handler = new ClientHandler(clientSocket);
	            new Thread(handler).start();
	        }
	    }

	    static class ClientHandler implements Runnable {
	        private Socket socket;
	        private PrintWriter out;
	        private BufferedReader in;

	        public ClientHandler(Socket socket) {
	            this.socket = socket;
	        }

	        public void run() {
	            try {
	                in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
	                out = new PrintWriter(socket.getOutputStream(), true);
	                clientWriters.add(out);

	                String message;
	                while ((message = in.readLine()) != null) {
	                    System.out.println("Received: " + message);
	                    if ("exit".equalsIgnoreCase(message)) {
	                        break;
	                    }

	                    // Broadcast to all clients
	                    synchronized (clientWriters) {
	                        for (PrintWriter writer : clientWriters) {
	                            if (writer != out) { // don't send to sender
	                                writer.println("Client says: " + message);
	                            }
	                        }
	                    }
	                }
	            } catch (IOException e) {
	                System.out.println("Error: " + e.getMessage());
	            } finally {
	                try {
	                    if (out != null) clientWriters.remove(out);
	                    if (socket != null) socket.close();
	                } catch (IOException e) {
	                    e.printStackTrace();
	                }
	                System.out.println("Client disconnected.");
	            }
	        }
	    }
}
