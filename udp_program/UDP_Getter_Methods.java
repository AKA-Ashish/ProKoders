package udp_program;

import java.net.*;

class UDP_Getter_Methods {
 public static void main(String[] args) {

  try {

   int port = 5000;

   byte byte_data[] = new byte[1024];

   DatagramSocket datagram_socket = new DatagramSocket(port);

   DatagramPacket datagram_packet = new DatagramPacket(byte_data, byte_data.length);

   datagram_socket.receive(datagram_packet);

   // GETTER METHODS
   System.out.println("Remote Host IP : " + datagram_packet.getAddress());

   System.out.println(datagram_packet.getPort());

   System.out.println(datagram_packet.getSocketAddress());

   System.out.println(new String(datagram_packet.getData()));

   System.out.println(datagram_packet.getLength());

   System.out.println(datagram_packet.getOffset());

   // Closing the Socket
   datagram_socket.close();

  } catch (Exception e) {
   System.out.println("ERROR : " + e.getMessage());
  }
 }
}
