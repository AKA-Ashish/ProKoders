package LabSix_Chat_Application_Socket;

import java.io.*;
import java.net.*;
import java.util.Scanner;

public class ClientSide {
 public static void main(String[] args) throws UnknownHostException, IOException {
  Scanner scanner = new Scanner(System.in);

  System.out.println("Client Started");

  Socket socket = new Socket("127.0.0.1", 1234);
  System.out.println("Connected to Server");

  while (true) {
   // Sending Data to Server
   DataOutputStream data_output_stream = new DataOutputStream(socket.getOutputStream());
   System.out.print("Enter Message : ");
   String output = scanner.nextLine();
   data_output_stream.writeUTF("Client : " + output);

   // Reading Data sended by Server
   DataInputStream data_input_stream = new DataInputStream(socket.getInputStream());
   String input = data_input_stream.readUTF();
   System.out.println(input);

  }

 }
}
