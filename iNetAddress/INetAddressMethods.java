package iNetAddress;

import java.net.*;

public class INetAddressMethods {
    public static void main(String[] args) {
        try {
            InetAddress address = InetAddress.getByName("www.google.com");
            System.out.println("Domain Name + IP : " + address);
            System.out.println("Host Name : " + address.getHostName());
            System.out.println("Host Address : " + address.getHostAddress());
            System.out.println("Is Any Local Address : " + address.isAnyLocalAddress());
            System.out.println("Is Link Local Adress : " + address.isLinkLocalAddress());
            System.out.println("Is Loop Back Address : " + address.isLoopbackAddress());
            System.out.println("Is Site Local Address : " + address.isSiteLocalAddress());

            System.out.println("Canonical Host Name : " + address.getCanonicalHostName());
            // returns Fully qualified domain name (FQDN)

            System.out.println("IP Address in Array[] Form : " + address.getAddress());
            // Returns IP Address in Form of Array;
            System.out.println("Is Multicast Address : " + address.isMulticastAddress());
        } catch (UnknownHostException e) {
            System.out.println("Unknown Host Exception : " + e);
        }
    }
}