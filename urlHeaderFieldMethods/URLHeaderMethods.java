package urlHeaderFieldMethods;

import java.io.*;
import java.net.*;
import java.util.*;

@SuppressWarnings("unused")
class URLHeaderMethods {

  public static void main(String[] args)
      throws MalformedURLException, IOException {
    URL url = new URL("https://www.google.com");
    URLConnection uc = url.openConnection();

    // 1.returns MIME Type -> Mime Identifies content data types i.e. text/html
    System.out.println("1.Content Type : " + uc.getContentType());

    // 2.returns content lenghth, '-1' if content is unknow or cannot be determined
    System.out.println("2.Content Length : " + uc.getContentLength());

    // 3.Retrieves date in long value
    System.out.println("3.getDate() : " + uc.getDate());

    // Storing getDate() to variable to convert it to date
    long date_time = uc.getDate();

    // Using Date class to convert long into date.
    Date date = new Date(date_time);
    System.out.println("Date/Time : " + date);

    // 4.content last modified date
    System.out.println("4.getLastModified : " + uc.getLastModified());

    // 5.returns content's ma set gareko expiry date
    System.out.println("5.getExpiration : " + uc.getExpiration());

    // 6.returns kun encoding use vaxa for retrieving content from url
    System.out.println("6.getContentEncoding : " + uc.getContentEncoding());

    // <------------------------------------------------------------------------------------------->

    // 7.returns contents of resources in , text -> string , binary ->byte[]
    // Note : String vaye not ARRAY,single line single variable mai sab hunxa , BYTE
    // vaye Array FORM
    System.out.println("7.getContent() as Obj : " + uc.getContent());

    // getContent through fetch gareko unknown content type lai Object variable ma
    // store gareko
    Object get_content_obj = uc.getContent();

    // We dont know getContent bata Text/Binary data aayo ? so, algorithm ko through
    // convert gareko

    // If fetched content is text/html (String) then converting to String and
    // Printing
    if (get_content_obj instanceof String) {
      String get_content_isString = (String) get_content_obj;
      System.out.println("Content as a String: " + get_content_isString);
      // If fetched content is binary (byte) then converting to byte and Printing
    } else if (get_content_obj instanceof byte[]) {
      byte[] get_content_isByte = (byte[]) get_content_obj;
      System.out.println(
          "Content as a byte array: " + Arrays.toString(get_content_isByte));
    } else {
      System.out.println("Content type not recognized");
    }

    // <------------------------------------------------------------------------------------------->

    // 8. "Content-Type" kun ho headerfield ko tyo Fetch garxa using getHeaderField
    String contentType = uc.getHeaderField("Content-Type");
    System.out.println("8.Content-Type: " + contentType);

    // 9.InputStream le full webcontent fetch gareko
    InputStream input_stream = uc.getInputStream();
    int input;
    // variable form mai print gareko just to be clear,below is the code that prints
    // the contents fully
    System.out.print("9." + input_stream);
    while ((input = input_stream.read()) != -1) {
      // System.out.print((char)input);
    }
    // 10.output_stream used to write data to the output stream, which will be sent
    // to the server.
    // uc.setDoOutput(false);
    // OutputStream output_stream = uc.getOutputStream();

  }
}
