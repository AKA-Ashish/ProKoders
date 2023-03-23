package urlNetworking;
import java.io.File;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.net.URL;
import java.net.URLConnection;
public class URLContentToFile {
    public static void main(String[] args) {
        File file = new File("urlcontent.html");
        // html file banako to store fetch html contents into it later.

        try {
            file.createNewFile(); //File Create vayo urlcontent.html

            FileWriter filewriter = new FileWriter(file);
            // FileWriter to write fetch html contents into urlcontent.html

            URL url = new URL("http://www.google.com");
            //kun url bata html content fetch garne define gareko.

            URLConnection uc =  url.openConnection();
            //connect gareko url sanga

            BufferedReader br = new BufferedReader(new InputStreamReader(uc.getInputStream()));
// uc vaneko url sanga connect object , getinputstream le fetch gareko uc object(url content) , inputstreamreader reads that content character by character and uses bufferedreader to read line by line and storing all that data into 'br'.

            String line; //declaring 

            // cant use - String line = br.readLine();
            // the while loop will be broken, as the value of line wont be updating and while loop will become INFINITE loop.

            while((line=br.readLine()) != null) 
            // br ma html content stored xa in Character form, teslai read gareko using readLine() & storing that into 'Line' variable
            // line by line read garda end ma gayesi NULL hunxa and loop stops
            {
                filewriter.write(line);
                // urlcontent.html file ma fetch gareko html contents write gareko
            }

           filewriter.close();
           //loop baira close else only one line will be written/stored into urlcontent.html

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
