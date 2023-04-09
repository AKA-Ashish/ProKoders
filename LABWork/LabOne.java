import java.net.*;
import java.io.*;

class LabOne {

 public static void main(String[] args) {

  // LAB 1
  // WAP to print content of GIVEN URL using Package.net

  try {
   URL url = new URL("https://www.google.com");

   URLConnection uc = url.openConnection();

   BufferedReader br = new BufferedReader(new InputStreamReader(uc.getInputStream()));
   String line;
   while ((line = br.readLine()) != null) {
    System.out.println(line);
   }

  } catch (Exception e) {
   System.out.println("Error : " + e.getMessage());
  }

 }

}
