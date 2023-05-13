package udp_multicastSocket;

import java.io.*;
import java.net.*;

class MultiCast_Client_Two {
	@SuppressWarnings("deprecation")

	public static void main(String[] args) throws IOException {

		int port = 5000;

		// Create the socket and join the multicast group
		MulticastSocket socket = new MulticastSocket();

		InetAddress inet = InetAddress.getByName("224.0.0.1");

		socket.joinGroup(inet);

		// Send a message
		String message = "Hello Im Client Two";

		byte[] buffer = message.getBytes();

		DatagramPacket packet = new DatagramPacket(buffer, buffer.length, inet, port);

		socket.send(packet);

		// Clean up
		socket.leaveGroup(inet);
		socket.close();
	}
}
