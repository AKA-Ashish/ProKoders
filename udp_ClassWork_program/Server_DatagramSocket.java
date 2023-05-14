import java.net.*;

public class Server_DatagramSocket {
 public static void main(String[] args) {

  try {

   DatagramSocket datagram_socket = new DatagramSocket(5000);

   byte[] buffer = new byte[2];
   byte[] send = { 12, 13 };

   // Receiving Data
   DatagramPacket datagram_packet = new DatagramPacket(buffer, 2);
   datagram_socket.receive(datagram_packet);
   System.out.println(datagram_packet.getData());

   // Sending Data
   DatagramPacket datagram_packet_send = new DatagramPacket(send, send.length, datagram_packet.getAddress(),
     datagram_packet.getPort());

   datagram_socket.send(datagram_packet_send);
   datagram_socket.close();

  } catch (Exception e) {
   System.out.println("Error : " + e.getMessage());
  }
 }
}
