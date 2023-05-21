package Lab10_RMI_MultiCastSocket.Lab_RMI;

import java.rmi.Naming;

class RMI_Client {

 public static void main(String[] args) {

  try {

   Adder skeleton = (Adder) Naming.lookup("rmi://localhost:1234/nist");

   System.out.println(skeleton.add(2, 1));

  } catch (Exception e) {
   System.out.println("Error in Client : " + e.getMessage());
  }
 }
}
