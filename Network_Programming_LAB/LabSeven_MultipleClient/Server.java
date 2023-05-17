import java.io.*;
import java.net.*;
import java.util.Scanner;

class Server {
 @SuppressWarnings("resource")
 public static void main(String[] args) throws IOException {
  ServerSocket serverSocket = new ServerSocket(8000);
  System.out.println("Listening on port 8000");

  while (true) {
   Socket clientSocket = serverSocket.accept();
   System.out.println("Accepted connection from " + clientSocket.getInetAddress());

   // create a new thread to handle the client connection
   Thread clientThread = new Thread(new ClientHandler(clientSocket));
   clientThread.start();
  }
 }
}

class ClientHandler implements Runnable {

 Scanner scanner = new Scanner(System.in);

 private Socket clientSocket;

 public ClientHandler(Socket socket) {
  this.clientSocket = socket;
 }

 public void run() {
  try {

   while (true) {

    // Reading Data
    DataInputStream dis = new DataInputStream(clientSocket.getInputStream());
    String client_message = dis.readUTF();
    System.out.println("Client " + clientSocket.getLocalSocketAddress() + " says :  " + client_message);

    // Sending Data
    DataOutputStream dos = new DataOutputStream(clientSocket.getOutputStream());
    // dos.writeUTF("Hello im Server :) ");
    System.out.print("Enter your message : ");
    String output = scanner.nextLine();
    dos.writeUTF(output);
   }

  } catch (IOException e) {
   System.err.println("Error handling client connection: " + e.getMessage());
  }
 }
}
