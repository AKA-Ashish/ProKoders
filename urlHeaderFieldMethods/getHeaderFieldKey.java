package urlHeaderFieldMethods;

import java.io.*;
import java.net.*;

public class getHeaderFieldKey {

  public static void main(String[] args)
    throws MalformedURLException, IOException {
    URL url = new URL("https://www.google.com");
    URLConnection uc = url.openConnection();

    for (int i = 1;; i++) {
      String check_key = uc.getHeaderFieldKey(i);
      if (check_key == null) {
        System.out.println("Loop Break");
        break;
      }
      //System.out.println(check_key); //Just prints Key names only

      //Prints key name with its respective headerfield value
      String header_field = uc.getHeaderField(i);
      System.out.println(check_key + " : " + header_field);
    }
  }
}
