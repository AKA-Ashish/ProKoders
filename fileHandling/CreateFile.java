package fileHandling;

import java.io.File;
//IO package ko File class lai Import gareko to use methods like 'createNewFile()'

public class CreateFile {
    public static void main(String[] args) {
        File file = new File("hello.txt");
        // Import gareko File class ko Object banako.
        try {
            file.createNewFile();
            // file obj ko through 'hello.txt' file create gareko
            System.out.println("File Created Successfully");
        } catch (Exception e) {
            System.out.println("Error Creating File : " + e);
        }
    }
}
