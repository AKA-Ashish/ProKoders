import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;

// Run client first in this case as we are sending data to multiple idle clients from one server
class Multicast_Server {
 public static void main(String[] args) {

  try {

   int port = 5000;

   MulticastSocket multicast_socket = new MulticastSocket(port);
   InetAddress inetAddress = InetAddress.getByName("224.0.0.1");

   for (int i = 0; i <= 3; i++) {
    String data = "hello world " + i;

    DatagramPacket datagram_packet = new DatagramPacket(data.getBytes(), data.getBytes().length, inetAddress, port);

    multicast_socket.send(datagram_packet);

    System.out.println("Data Sent : " + data);

    Thread.sleep(1000);
   }

   multicast_socket.close();

  } catch (Exception e) {
   System.out.println("Error in Server : " + e.getMessage());
  }
 }
}