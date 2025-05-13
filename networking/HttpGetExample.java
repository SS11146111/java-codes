package com.sangita.networking;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class HttpGetExample {

	 public void getContent()
	 {
		 try {
	         // Example public API (you can replace this with any valid API endpoint)
	         String urlString = "https://api.chucknorris.io/jokes/random";

	         // Create URL and open connection
	         URL url = new URL(urlString);
	         HttpURLConnection conn = (HttpURLConnection) url.openConnection();

	         // Set request method
	         conn.setRequestMethod("GET");

	         // Read response
	         BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
	         String inputLine;
	         StringBuilder response = new StringBuilder();

	         while ((inputLine = in.readLine()) != null) {
	             response.append(inputLine).append("\n");
	         }

	         in.close();

	         // Print response
	         System.out.println("Response from API:");
	         System.out.println(response.toString());

	     } catch (Exception e) {
	         e.printStackTrace();
	     }
	 }
}
