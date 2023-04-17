package multithreadingChatApp;

import java.net.*;
import java.io.*;
import java.util.Scanner;

public class Client_One {
 public static void main(String[] args) {

  Scanner scanner = new Scanner(System.in);

  try {

   System.out.println("Client ONE Started !");
   Socket client_socket = new Socket("localhost", 8888);
   System.out.println("Client Connection to Server Established " + client_socket.getRemoteSocketAddress());

   while (true) {

    // Sending data to Client
    DataOutputStream data_output_stream = new DataOutputStream(client_socket.getOutputStream());
    System.out.print("Enter Message : ");
    String output = scanner.nextLine();
    data_output_stream.writeUTF(output);

    // Reading Data from Server
    DataInputStream data_input_stream = new DataInputStream(client_socket.getInputStream());
    String input = data_input_stream.readUTF();
    System.out.println("Server says : " + input);

   }
  } catch (Exception e) {
   System.out.println("Error in Client : " + e.getMessage());
  }
 }
}
