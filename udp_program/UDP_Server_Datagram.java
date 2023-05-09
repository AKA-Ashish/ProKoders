package udp_program;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

class UDP_Server_Datagram {
  public static void main(String[] args) {

    try {

      int port = 5000;

      byte byte_data[] = new byte[1024];

      DatagramSocket datagram_socket = new DatagramSocket(port);

      DatagramPacket datagram_packet = new DatagramPacket(byte_data, byte_data.length);

      datagram_socket.receive(datagram_packet);

      String message = new String(datagram_packet.getData(), datagram_packet.getOffset(),
          datagram_packet.getLength());

      System.out.println("Received message: " + message);

      datagram_socket.close();

    } catch (Exception e) {
      System.out.println("ERROR : " + e.getMessage());
    }

  }

}
