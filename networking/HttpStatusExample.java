package com.sangita.networking;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class HttpStatusExample {
	
	public void test()
	{
		try {
            // Test with any URL: use an invalid one to simulate 404 or 500
            String urlString = "https://httpbin.org/status/200"; // Change to 404 or 500 to test
            URL url = new URL(urlString);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();

            conn.setRequestMethod("GET");

            int statusCode = conn.getResponseCode();
            System.out.println("HTTP Status Code: " + statusCode);

            switch (statusCode) {
                case HttpURLConnection.HTTP_OK:
                    System.out.println("✅ 200 OK - Request succeeded.");
                    printResponse(conn);
                    break;
                case HttpURLConnection.HTTP_NOT_FOUND:
                    System.out.println("❌ 404 Not Found - The requested resource does not exist.");
                    break;
                case HttpURLConnection.HTTP_INTERNAL_ERROR:
                    System.out.println("💥 500 Server Error - The server encountered an error.");
                    break;
                default:
                    System.out.println("ℹ️ Received status: " + statusCode + " - " + conn.getResponseMessage());
            }

        } catch (Exception e) {
            System.out.println("⚠️ Error: " + e.getMessage());
        }
	}
	
	 private static void printResponse(HttpURLConnection conn) {
	        try (BufferedReader in = new BufferedReader(
	                new InputStreamReader(conn.getInputStream()))) {
	            String inputLine;
	            System.out.println("🔽 Response Content:");
	            while ((inputLine = in.readLine()) != null) {
	                System.out.println(inputLine);
	            }
	        } catch (Exception e) {
	            System.out.println("⚠️ Error reading response: " + e.getMessage());
	        }
	    }

}
