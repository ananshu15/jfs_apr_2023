package fileHandling;

import java.io.*;

public class writingReadingOnFile {
    public static void main(String[] args) throws IOException {
        File file = new File("studyeasy");
        file.mkdir();
        file = new File("studyeasy\\ananshu.txt");
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(file, true))) {
            bw.write("Hello World");
            bw.newLine();
            bw.write("Ananshu");
            bw.newLine();
            bw.write("How are you?");
            bw.newLine();
            bw.write("I am fine");
            bw.newLine();
            bw.write("Thank you");
            System.out.println("File written successfully");
            bw.close();

        } catch (IOException e) {
            System.out.println("Error occurred");
        }
        try {
            BufferedReader br = new BufferedReader(new FileReader("studyeasy\\ananshu.txt"));
            String line;
            System.out.println("************");
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
