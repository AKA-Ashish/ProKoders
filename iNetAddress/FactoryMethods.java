package iNetAddress;

import java.net.*;

public class FactoryMethods {
    public static void main(String[] args) {
        try {
            // Method 1 : GetLocalHost
            InetAddress address = InetAddress.getLocalHost();
            System.out.println("Local Host : " + address);

            // Method 2 : getByName
            InetAddress address2 = InetAddress.getByName("www.google.com");
            System.out.println("Get by Name | DomainName + IP : " + address2);

            // Method 3 : getAllByName -Returns in Array Form
            // Returns Ipv4 32bits & Ipv6 128bits address
            InetAddress address3[] = InetAddress.getAllByName("www.google.com");
            for (InetAddress i : address3) {
                System.out.println("GetAllByName : " + i);
            }

            // Method 4 : getByAddress(IP)
            byte myIp[] = { 127, 0, 0, 1 };
            InetAddress address4 = InetAddress.getByAddress(myIp);
            System.out.println("GetByAddress : " + address4);

            // Method 5 : getByAddress(String Hostname,IP)
            InetAddress address5 = InetAddress.getByAddress("www.google.com", myIp);
            System.out.println("GetByAddress : " + address5);

        } catch (UnknownHostException e) {
            System.out.println("Unknown Host Exception : " + e);
        }
    }
}
