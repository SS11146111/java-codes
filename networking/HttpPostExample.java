package com.sangita.networking;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;

public class HttpPostExample {

	public void postContent()
	{
		 try {
	            // Replace with your server or API endpoint that accepts POST
	            String urlString = "https://httpbin.org/post"; // A public test endpoint
	            URL url = new URL(urlString);
	            HttpURLConnection conn = (HttpURLConnection) url.openConnection();

	            // Set up connection properties
	            conn.setRequestMethod("POST");
	            conn.setDoOutput(true); // Enables writing data
	            conn.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");

	            // Form data
	            String formData = "username=testuser&password=12345";

	            // Write data to request body
	            try (OutputStream os = conn.getOutputStream()) {
	                byte[] input = formData.getBytes(StandardCharsets.UTF_8);
	                os.write(input, 0, input.length);
	            }

	            // Read response
	            BufferedReader in = new BufferedReader(
	                    new InputStreamReader(conn.getInputStream()));
	            String line;
	            StringBuilder response = new StringBuilder();

	            while ((line = in.readLine()) != null) {
	                response.append(line).append("\n");
	            }

	            in.close();

	            // Print the response
	            System.out.println("Server Response:");
	            System.out.println(response.toString());

	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	}
}
