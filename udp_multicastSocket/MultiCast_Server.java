package udp_multicastSocket;

import java.net.*;
import java.io.*;

class MultiCast_Server {
	@SuppressWarnings({ "deprecation", "resource" })

	public static void main(String[] args) throws IOException {

		int port = 5000;

		// Create the socket and join the multicast group
		MulticastSocket socket = new MulticastSocket(port);

		InetAddress inet = InetAddress.getByName("224.0.0.1");

		socket.joinGroup(inet);

		while (true) {

			// Receive a message
			byte[] buffer = new byte[1024];

			DatagramPacket packet = new DatagramPacket(buffer, buffer.length);

			socket.receive(packet);

			String message = new String(packet.getData(), packet.getOffset(), packet.getLength());

			// Print the message
			System.out.println("Received message: " + message);
		}

	}
}
