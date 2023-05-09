package udp_program;

import java.io.IOException;
import java.net.*;

class UDP_Client_Datagram {
 public static void main(String[] args) {

  try {

   byte[] data = "hello bro".getBytes();

   int port = 5000;

   InetAddress inet_address = InetAddress.getByName("localhost");

   DatagramSocket datagram_socket = new DatagramSocket();

   DatagramPacket datagram_packet = new DatagramPacket(data, data.length, inet_address, port);

   datagram_socket.send(datagram_packet);

   datagram_socket.close();

  } catch (SocketException e) {
   System.out.println("ERROR : " + e.getMessage());
  } catch (UnknownHostException e) {
   System.out.println("ERROR : " + e.getMessage());
  } catch (IOException e) {
   System.out.println("ERROR : " + e.getMessage());

  }

 }

}