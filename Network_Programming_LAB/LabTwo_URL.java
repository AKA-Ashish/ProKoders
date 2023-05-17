import java.net.*;
import java.io.*;

public class LabTwo_URL {
 public static void main(String[] args) {

  // Lab 2
  // WAP to Save content of Given URL into a File using Package.net

  try {
   // Create File
   File file = new File("sample.html");
   file.createNewFile();

   // Creating FileWriter to write Fetched Url content into the File
   FileWriter file_writer = new FileWriter(file);

   // Fetch URL content
   URL url = new URL("https://www.google.com");
   URLConnection uc = url.openConnection();

   BufferedReader br = new BufferedReader(new InputStreamReader(uc.getInputStream()));
   String line;
   while ((line = br.readLine()) != null) {
    file_writer.write(line);
   }
   file_writer.close();
  } catch (Exception e) {
   System.out.println("Error : " + e.getMessage());
  }
 }

}
