package Lab10_RMI_MultiCastSocket.Lab_RMI;

import java.rmi.*;

public interface Adder extends Remote {
 public int add(int x, int y) throws Exception;
}