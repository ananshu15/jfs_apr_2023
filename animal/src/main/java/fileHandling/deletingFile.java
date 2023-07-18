package fileHandling;

import java.io.File;

public class deletingFile {
    public static void main(String[] args) {
        File file = new File("studeyeasy\\test.txt");
        if (file.delete()) {
            System.out.println("File deleted successfully");
        } else {
            System.out.println("Failed to delete the file");
        }
    }
}
