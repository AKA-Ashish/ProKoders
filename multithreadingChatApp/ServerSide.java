package multithreadingChatApp;

import java.net.*;
import java.io.*;
import java.util.Scanner;

@SuppressWarnings("resource")
public class ServerSide {
 public static void main(String[] args) {
  // this program doesnt function properly, yet to be fixed
  // issue : one new client joins, server no longer can chat with previous client

  try {

   ServerSocket server_socket = new ServerSocket(8888);
   System.out.println("Server Started !");

   System.out.println("Waiting for Client");

   while (true) {

    Socket client_socket = server_socket.accept();
    System.out.println("Client Connected : " + client_socket.getLocalSocketAddress());

    // Thread class ko Object create gareko and tesko vitra constructor call garera
    // Args pass gareko
    Thread thread_object = new Thread(new ServerMultithreadHandler(client_socket));

    thread_object.start();

   }
  } catch (Exception e) {
   System.out.println("Error in Server : " + e.getMessage());
  }
 }
}

// Class created to handle multiple clients connection using multithreading
// technology

class ServerMultithreadHandler implements Runnable {

 Scanner scanner = new Scanner(System.in);
 private Socket client_socket;

 ServerMultithreadHandler(Socket socket_parameter) {
  this.client_socket = socket_parameter;
 }

 public void run() {

  try {

   // Reading Client Data
   DataInputStream data_input_stream = new DataInputStream(client_socket.getInputStream());
   String client_input = data_input_stream.readUTF();
   System.out.println("Client Says : " + client_input);

   // Sending Feedback to Client
   DataOutputStream data_output_stream = new DataOutputStream(client_socket.getOutputStream());
   System.out.print("Enter Message : ");
   String output = scanner.nextLine();
   data_output_stream.writeUTF(output);

  } catch (Exception e) {
   System.out.println("Error in Server Thread Handling : " + e.getMessage());
  }
 }
}
