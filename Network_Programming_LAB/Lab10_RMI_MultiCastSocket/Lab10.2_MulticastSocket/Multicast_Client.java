import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;

// We can create multiple clients and all of them will receive the data sended by Multicast Server
@SuppressWarnings("resource")
class Multicast_Client {
 public static void main(String[] args) {

  try {

   int port = 5000;

   byte buffer[] = new byte[1024];

   InetAddress inetAddress = InetAddress.getByName("224.0.0.1");

   MulticastSocket multicast_socket = new MulticastSocket(port);

   multicast_socket.joinGroup(inetAddress);

   while (true) {
    DatagramPacket datagram_packet = new DatagramPacket(buffer, buffer.length);

    multicast_socket.receive(datagram_packet);

    String data = new String(buffer, 0, buffer.length);

    System.out.println("Received data : " + data);
   }

  } catch (Exception e) {
   System.out.println("Error in Client : " + e.getMessage());
  }
 }
}
