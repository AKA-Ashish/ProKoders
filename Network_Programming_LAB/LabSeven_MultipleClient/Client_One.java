import java.io.*;
import java.net.*;
import java.util.Scanner;

class Client_One {

 @SuppressWarnings("resource")
 public static void main(String[] args) {

  Scanner scanner = new Scanner(System.in);

  try {

   Socket socket = new Socket("localhost", 8000);
   System.out.println("Connected to Server");

   while (true) {
    // Sending to Server
    DataOutputStream dos = new DataOutputStream(socket.getOutputStream());

    System.out.print("Enter your message : ");
    String output = scanner.nextLine();
    dos.writeUTF(output);

    // Receiving from Server
    DataInputStream dis = new DataInputStream(socket.getInputStream());
    String server_feedback = dis.readUTF();

    System.out.println("Server says : " + server_feedback);
   }

  } catch (Exception err) {
   System.out.println("Error in Client : " + err.getMessage());
  }
 }

}
