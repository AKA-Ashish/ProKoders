package fileHandling;

import java.io.*;

public class CreateFile {
    public static void main(String[] args) {
        File file = new File("hello.txt");
        try {
            file.createNewFile();
            System.out.println("File Created Successfully");
        } catch (Exception e) {
            System.out.println("Error Creating File : " + e);
        }
    }
}
