package urlNetworking;

import java.net.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class OpenConnection {
    public static void main(String[] args) {
        try {
            URL url = new URL("https://www.google.com");
            URLConnection uc = url.openConnection();

            BufferedReader buffer = new BufferedReader(new InputStreamReader(uc.getInputStream()));
            // url ko content lai read garxa then getInputStream ko through buffer ma store

            String x;
            while ((x = buffer.readLine()) != null) {
                System.out.println(x);
            }

        } catch (Exception e) {
            System.out.println("Error : " + e);
        }
    }
}
