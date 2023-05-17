import java.net.*;

public class LabThree_URL {
 public static void main(String[] args) {

  // LAB 3
  // WAP to display all Header Fields of URL using Package.net

  try {

   URL url = new URL("https://www.google.com");

   URLConnection uc = url.openConnection();

   for (int i = 1;; i++) {
    String header_key = uc.getHeaderFieldKey(i);
    if (header_key == null) {
     System.out.println("Loop Breaked :)");
     break;
    }
    String header_field = uc.getHeaderField(i);

    System.out.println(header_key + " : " + header_field);
   }

  } catch (Exception e) {
   System.out.println("Error : " + e.getMessage());
  }

 }

}
