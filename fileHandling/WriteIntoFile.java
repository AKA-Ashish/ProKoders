package fileHandling;

import java.io.FileWriter;
// Filewriter class import 

public class WriteIntoFile {
    public static void main(String[] args) {
        try {
            FileWriter filewriter = new FileWriter("hello.txt"); // hello.txt open gareko
            filewriter.write("im writing this message into the file :)"); // write gareko text
            filewriter.close(); // save & close gareko notepad

            System.out.println("File Written Successfull");
        } catch (Exception e) {
            System.out.println("Error : " + e);
        }
    }
}
