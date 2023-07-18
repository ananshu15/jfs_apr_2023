package tryCatchFinal.Excep;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class checkUncheckExcep {
    public static void main(String[] args) {
        int x = 0;
        int y = 10 / x;
        System.out.println(y);   // This will throw an ArithmeticException which is unchecked exception
                                //Exception which are not checked at compile time are called unchecked exception

        try {
            FileReader fileReader = new FileReader("someFile.txt");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        // This will throw a FileNotFoundException which is checked exception

        //Exception which are checked at compile time are called checked exception



    }

}
