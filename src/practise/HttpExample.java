package practise;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.stream.Collectors;

public class HttpExample {
    public static void main ( String[] args ) {
        String data = getRequestWithParams("Kenya");
        System.out.println(data);
    }
    public static String getRequestWithParams(String countryName) {
        try {
            String baseUrl = "https://jsonmock.hackerrank.com/api/countries?";
            String fullUrl = baseUrl + "name=" + countryName;
            URL url = new URL(fullUrl);

            HttpURLConnection con = (HttpURLConnection) url.openConnection();
            con.setRequestMethod("GET");
            con.setRequestProperty("Content-Type", "application/json");

            int responseCode = con.getResponseCode();
            if (responseCode == HttpURLConnection.HTTP_OK) {
                BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
                String jsonResult = in.lines().collect(Collectors.joining());
                in.close();

                return jsonResult;
            } else {
                System.out.println("HTTP error code: " + responseCode);
            }
        } catch (Exception e) {
            System.out.println("Exception occurred: " + e.getMessage());
        }
        return null;
    }
}