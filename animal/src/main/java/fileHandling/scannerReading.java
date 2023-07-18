package fileHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class scannerReading {
    public static void main(String[] args) {

        try {
            Scanner sc = new Scanner(new File("test.txt"));
            String line;
            while (sc.hasNextLine()) {
                line = sc.nextLine();
                System.out.println(line);
            }
            sc.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }

    }
}
