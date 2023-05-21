package Lab10_RMI_MultiCastSocket.Lab_RMI;

import java.rmi.Naming;

class RMI_Server {

 public static void main(String[] args) {

  try {

   Adder stub = new AdderRemote();

   Naming.rebind("rmi://localhost:1234/nist", stub);

  } catch (Exception e) {
   System.out.println("Error in Server : " + e.getMessage());
  }
 }

}