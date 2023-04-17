package LabSix_Chat_Application_Socket;

import java.net.*;
import java.io.*;
import java.util.Scanner;

public class ServerSide {

 public static void main(String[] args) throws IOException {
  Scanner scanner = new Scanner(System.in);

  System.out.println("Server Started");
  ServerSocket server_socket = new ServerSocket(1234);
  System.out.println("Waiting for Client Request....");

  Socket client_socket = server_socket.accept();
  System.out.println("Connection Established ! ");

  while (true) {
   // Reading Data sended by Client
   DataInputStream data_input_stream = new DataInputStream(client_socket.getInputStream());
   String input = data_input_stream.readUTF();
   System.out.println(input);

   // Sending Data to Client
   DataOutputStream data_output_stream = new DataOutputStream(client_socket.getOutputStream());
   System.out.print("Enter Message : ");
   String output = scanner.nextLine();
   data_output_stream.writeUTF("Server : " + output);

  }
 }
}
