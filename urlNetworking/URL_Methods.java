package urlNetworking;

import java.net.*;

public class URL_Methods {
    public static void main(String[] args) {
        try {
            URL url = new URL("https://github.com/explore");

            System.out.println("HOST : " + url.getHost());
            // Domain Name fetch

            System.out.println("Protocol : " + url.getProtocol());
            // kun Protocol ho, eg.https

            System.out.println("Port : " + url.getPort());
            // Port kun use vaxa

            System.out.println("CONTENT : " + url.getContent());
            // Contents of website Fetch garxa

            System.out.println("File Name : " + url.getFile());
            // File name Fetch garxa. eg.www.google.com/index.html -> file name : index.html

        } catch (Exception e) {
            System.out.println("Error : " + e);
        }
    }
}
