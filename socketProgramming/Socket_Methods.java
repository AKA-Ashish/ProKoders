import java.net.*;

class Socket_Methods {

 public static void main(String[] args) {

  try {
   Socket socket = new Socket("localhost", 3306);

   // To store these Address we can use 'SocketAddres x = socket.get.....()'
   System.out.println("Local Socket Address (ClientAddress) : " + socket.getLocalSocketAddress());

   System.out.println("Remote Socket Address (Connected Server) : " + socket.getRemoteSocketAddress());

   System.out.println("toString (Socket Type Casting) : " + socket.toString());

   System.out.println("isClosed() : " + socket.isClosed());

   System.out.println("isConnected() : " + socket.isConnected());

   System.out.println("getPort (Server Port) : " + socket.getPort());
   System.out.println("getLocalPort (Client Port) : " + socket.getLocalPort());

   // True -> Send's data immediately as soon as it is written to the socket output
   // stream
   socket.setTcpNoDelay(true);

   // Sets a Delay in Socket data transfer to tackle sync problem
   socket.setSoTimeout(1000);

   // socket.setReceiveBufferSize(0);

   // socket.setSendBufferSize(0);

   System.out.println("Receive Buffer Size : " + socket.getReceiveBufferSize());

   // Enable/Disable Keep Alive Packets for Socket
   socket.setKeepAlive(true);

   // Enable/Disable socket object ability to reuse local address & port
   socket.setReuseAddress(false);

   socket.setTrafficClass(1);

   socket.close();

  } catch (Exception e) {
   System.out.println("Error : " + e.getMessage());
  }
 }

}
