package uriNetworking;

import java.net.URLDecoder;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;

class URL_Encode_Decode {

  public static void main(String[] args) {
    try {
      String original_url = "https://www.google.com";

      //StandardCharsets.UTF_8 is a constant of type Charset that represents the UTF-8 character set
      String encoded_url = URLEncoder.encode(
        original_url,
        StandardCharsets.UTF_8
      );

      //StandardCharsets.UTF_8.toString() returns the name of the character set as a string, which is "UTF-8".
      String decoded_url = URLDecoder.decode(
        encoded_url,
        StandardCharsets.UTF_8.toString()
      );

      System.out.println("Original Url : " + original_url);

      System.out.println("Encoded Url : " + encoded_url);

      System.out.println("Decoded Url : " + decoded_url);
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
