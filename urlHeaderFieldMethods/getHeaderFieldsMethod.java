package urlHeaderFieldMethods;

import java.net.*;
import java.util.List;
import java.util.Map;

public class getHeaderFieldsMethod {

  public static void main(String[] args) {
    // How getHeaderFields work ? If NULL or Blank value then returns MAP with all headerfields contents
    // If specified value given for eg 'Content-Type' then headerfield ko content type k xa tyo return garxa

    try {
      URL url = new URL("https://www.google.com");
      URLConnection uc = url.openConnection();

      // map_list_obj contains key value pairs of headercontents i.e. "Content-Type" -> ["text/html; charset=UTF-8"]
      Map<String, List<String>> map_list_obj = uc.getHeaderFields();
      // System.out.println(map_list_obj);

      System.out.println(map_list_obj.get("Permission-Policy"));

      // Other header fields type details we can fetch
      System.out.println(
        "Permission-Policy : " + uc.getHeaderField("Permission-Policy")
      );
      System.out.println("Content-Type : " + uc.getHeaderField("Content-Type"));
      System.out.println(
        "Content-Encoding : " + uc.getHeaderField("Content-Encoding")
      );
      System.out.println(
        "Last-Modified : " + uc.getHeaderField("Last-Modified")
      );
      System.out.println("ETag : " + uc.getHeaderField("ETag"));
      System.out.println("User-Agent : " + uc.getHeaderField("User-Agent"));
      System.out.println("Referer : " + uc.getHeaderField("Referer"));
      System.out.println("Cookie : " + uc.getHeaderField("Cookie"));
      System.out.println("\nSet-Cookie : " + uc.getHeaderField("Set-Cookie"));
      System.out.println(
        "\nCache-Control : " + uc.getHeaderField("Cache-Control")
      );
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
