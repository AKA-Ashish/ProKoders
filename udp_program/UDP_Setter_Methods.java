package udp_program;

import java.net.*;

class UDP_Setter_Methods {
 public static void main(String[] args) {

  try {

   byte[] data = "hello bro".getBytes();

   int port = 5000;

   InetAddress inet_address = InetAddress.getByName("localhost");

   DatagramSocket datagram_socket = new DatagramSocket();

   DatagramPacket datagram_packet = new DatagramPacket(data, data.length);

   // SETTER METHODS - 4

   // Modify DATA
   datagram_packet.setData("action".getBytes());

   // sends 'n' characters
   datagram_packet.setLength(3);

   datagram_packet.setAddress(inet_address);

   datagram_packet.setPort(port);

   // Sending the Data and Closing the Socket
   datagram_socket.send(datagram_packet);
   datagram_socket.close();

  } catch (Exception e) {
   System.out.println("ERROR : " + e.getMessage());
  }

 }
}
