package LabFive_SimpleServerConnection;

import java.io.IOException;
import java.net.*;

public class LabFive_ClientSocket {
 public static void main(String[] args) throws UnknownHostException, IOException {

  System.out.println("Client Started");

  Socket socket = new Socket("127.0.0.1", 1234);
  // getRemoteSocketAddress() returns address of connected system(server)
  System.out.println("Connected to Server" + socket.getRemoteSocketAddress());

  socket.close();
 }
}
