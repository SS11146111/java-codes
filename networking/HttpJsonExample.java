package com.sangita.networking;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import org.json.JSONObject;

public class HttpJsonExample {
    public void test() {
        try {
            // Public JSON API
            String apiUrl = "https://api.chucknorris.io/jokes/random";
            URL url = new URL(apiUrl);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");

            // Read the JSON response
            BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            StringBuilder json = new StringBuilder();
            String line;

            while ((line = in.readLine()) != null) {
                json.append(line);
            }
            in.close();

            // Parse JSON and extract specific fields
            JSONObject jsonObject = new JSONObject(json.toString());
            String joke = jsonObject.getString("value");
            String id = jsonObject.getString("id");

            System.out.println("Joke ID: " + id);
            System.out.println("Joke: " + joke);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
