package main.java.Day7;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class URLShortener {
    public static void main(String[] args) {
        String originalUrl = "https://www.example.com"; // Replace with your original URL

        String shortUrl = shortenURL(originalUrl);
        System.out.println("Short URL: " + shortUrl);
    }

    private static String shortenURL(String originalUrl) {
        try {
            // Create an instance of the SHA-256 algorithm
            MessageDigest md = MessageDigest.getInstance("SHA-256");
            byte[] hashBytes = md.digest(originalUrl.getBytes());

            // Convert the hash bytes to a hexadecimal string
            StringBuilder sb = new StringBuilder();
            for (byte b : hashBytes) {
                sb.append(String.format("%02x", b));
            }

            // Take the first 8 characters of the hexadecimal string as the short URL
            return sb.toString().substring(0, 8);
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            return null;
        }
    }
}
