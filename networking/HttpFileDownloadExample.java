package com.sangita.networking;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;

public class HttpFileDownloadExample {

	    public static void test() {
	        // URL of the file to download
	        String fileURL = "https://www.w3.org/WAI/ER/tests/xhtml/testfiles/resources/pdf/dummy.pdf"; // Replace with actual file URL
	        // Local destination file
	        String savePath = "C:\\Users\\User\\eclipse-workspace\\practice_codes\\codes\\src\\com\\sangita\\networking\\downloaded_sample.pdf";

	        try {
	            // Create URL and open connection
	            URL url = new URL(fileURL);
	            HttpURLConnection httpConn = (HttpURLConnection) url.openConnection();
	            httpConn.setRequestMethod("GET");

	            int responseCode = httpConn.getResponseCode();

	            // Check if response is OK
	            if (responseCode == HttpURLConnection.HTTP_OK) {
	                // Open input stream from the HTTP connection
	                InputStream inputStream = httpConn.getInputStream();

	                // Open output stream to save the file
	                FileOutputStream outputStream = new FileOutputStream(savePath);

	                byte[] buffer = new byte[4096];
	                int bytesRead;

	                // Read from input and write to output
	                while ((bytesRead = inputStream.read(buffer)) != -1) {
	                    outputStream.write(buffer, 0, bytesRead);
	                }

	                // Close streams
	                outputStream.close();
	                inputStream.close();

	                System.out.println("✅ File downloaded to: " + new File(savePath).getAbsolutePath());
	            } else {
	                System.out.println("❌ No file to download. Server replied with HTTP code: " + responseCode);
	            }

	            httpConn.disconnect();
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	    }
	}

