package LabFive_SimpleServerConnection;

import java.io.IOException;
import java.net.*;

public class LabFive_ServerSocket {
 public static void main(String[] args) throws IOException {

  System.out.println("Server Started");
  ServerSocket server_socket = new ServerSocket(1234);
  System.out.println("Waiting for Client Request....");

  Socket client_socket = server_socket.accept();
  // getLocalSocketAddress() returns client ko address
  System.out.println("Connection Established ! " + client_socket.getLocalSocketAddress());

  server_socket.close();
 }
}
