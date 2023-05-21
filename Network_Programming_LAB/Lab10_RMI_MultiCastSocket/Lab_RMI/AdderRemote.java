package Lab10_RMI_MultiCastSocket.Lab_RMI;

import java.rmi.server.UnicastRemoteObject;

class AdderRemote extends UnicastRemoteObject implements Adder {

 AdderRemote() throws Exception {
 }

 @Override
 public int add(int x, int y) {
  return x + y;
 }
}
