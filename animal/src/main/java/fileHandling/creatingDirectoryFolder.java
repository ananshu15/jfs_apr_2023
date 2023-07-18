package fileHandling;

import java.io.File;
import java.io.IOException;

public class creatingDirectoryFolder {
    public static void main(String[] args) throws IOException {

        File directory = new File("C:\\studyeasy\\author\\ananshu");
        directory.mkdirs();
        System.out.println("Directory created successfully");
        File file = new File("C:\\studyeasy\\author\\ananshu\\ananshu.txt");
        file.createNewFile();
        System.out.println("File created successfully");
    }
}
