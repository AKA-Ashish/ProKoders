import java.net.*;

public class Client_DatagramSocket {
 public static void main(String[] args) {

  try {

   DatagramSocket datagram_socket = new DatagramSocket();

   InetAddress address = InetAddress.getByName("localhost");

   int port = 5000;

   byte[] buffer = { 12, 13 };
   byte[] buffer1 = new byte[2];

   // Connecting Socket to server
   datagram_socket.connect(address, port);

   // Getter Methods
   System.out.println("isBound : " + datagram_socket.isBound());
   System.out.println("isConnected : " + datagram_socket.isConnected());
   System.out.println("InetAddress : " + datagram_socket.getInetAddress());
   System.out.println("Port : " + datagram_socket.getPort());
   System.out.println("Remote Socket : " + datagram_socket.getRemoteSocketAddress());
   System.out.println("Local Socket : " + datagram_socket.getLocalSocketAddress());
   System.out.println("Local Port : " + datagram_socket.getLocalPort());

   // Sending Packet
   DatagramPacket datagram_packet = new DatagramPacket(buffer, buffer.length, address, port);

   datagram_socket.send(datagram_packet);
   System.out.println("Data Packet Sent");

   // Receiving Packet
   DatagramPacket receive = new DatagramPacket(buffer1, 2);

   datagram_socket.receive(receive);

   System.out.println("Data Received : " + receive.getData());

   // Adding Delay of 100ms
   datagram_socket.setSoTimeout(100);
   datagram_socket.close();

  } catch (Exception e) {

   System.out.println("Error : " + e.getMessage());
  }

 }
}
