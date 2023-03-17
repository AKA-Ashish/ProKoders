package fileHandling;

import java.io.FileReader;
// Filreader reads Data from FILE in CHAR value

import java.io.BufferedReader;
// BufferedReader reads that same FILE line by line into String

public class ReadFile {
    public static void main(String[] args) {
        try {
            FileReader filereader = new FileReader("hello.txt"); // hello.txt char value read
            BufferedReader bufferreader = new BufferedReader(filereader); // char value to string
            String x = bufferreader.readLine();
            // bufferreader le read gareko String lai 'X' variable ma store gareko
            bufferreader.close();
            System.out.println(x);
        } catch (Exception e) {
            System.out.println("Error : " + e);
        }
    }
}
