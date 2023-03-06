//package practise;
//
//import org.json.JSONArray;
//import org.json.JSONObject;
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.net.HttpURLConnection;
//import java.net.URL;
//
//public class InventoryClient {
//
//    public static void main(String[] args) {
//        String barcode = "123456789"; // replace with the actual barcode value
//        String urlString = "https://jsonmock.hackerank.com/api/inventory?barcode=" + barcode;
//        try {
//            URL url = new URL(urlString);
//            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
//            connection.setRequestMethod("GET");
//            connection.setRequestProperty("Accept", "application/json");
//            BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
//            String inputLine;
//            StringBuffer response = new StringBuffer();
//            while ((inputLine = reader.readLine()) != null) {
//                response.append(inputLine);
//            }
//            reader.close();
//            connection.disconnect();
//            JSONObject jsonObject = new JSONObject(response.toString());
//            int totalPages = jsonObject.getInt("total_pages");
//            JSONArray data = jsonObject.getJSONArray("data");
//            for (int i = 0; i < data.length(); i++) {
//                JSONObject item = data.getJSONObject(i);
//                double price = item.getDouble("price");
//                double discount = item.getDouble("discount");
//                double discountedPrice = price - (price * discount / 100);
//                System.out.println("Item Name: " + item.getString("name") + ", Discounted Price: " + discountedPrice);
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
//}
