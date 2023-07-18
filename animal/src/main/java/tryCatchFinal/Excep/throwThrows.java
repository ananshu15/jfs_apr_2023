package tryCatchFinal.Excep;

import java.io.FileNotFoundException;

public class throwThrows {
    public static void main(String[] args) {
        try {
            someMethod();
        } catch (FileNotFoundException e) {
            System.out.println("Message for main");
        } catch (Exception e) {
            System.out.println("Message for main");
        }


    }

    public static void someMethod() throws Exception {
        System.out.println("Message for someMethod");
        throw new Exception();
    }
}
