import java.io.*;
import java.net.*;
import javax.net.ssl.*;

class LabEight_SSLSocket_CipherSuites {

 public static void main(String[] args) throws UnknownHostException, IOException {

  SSLSocketFactory ssl_socket_factory = (SSLSocketFactory) SSLSocketFactory.getDefault();

  SSLSocket ssl_socket = (SSLSocket) ssl_socket_factory.createSocket("www.google.com", 443);

  String[] suites = ssl_socket.getSupportedCipherSuites();

  ssl_socket.setEnabledCipherSuites(suites);

  ssl_socket.addHandshakeCompletedListener(new MyHandShake_Class());

  ssl_socket.startHandshake();

  System.out.println("Connected to : " + ssl_socket.getRemoteSocketAddress());

 }
}

class MyHandShake_Class implements HandshakeCompletedListener {
 @Override
 public void handshakeCompleted(HandshakeCompletedEvent event) {

  System.out.println("Session Info : " + event.getSession());
 }
}
