package tryCatchFinal.Excep;

public class tryCatchFinal {
    public static void main(String[] args) {
        int x = 0;

        try {
            int y = 10 / x;
            System.out.println(y);
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero");
        } catch (Exception e) {
            System.out.println("Something went wrong");
        } finally {
            System.out.println("This is the end of the program");
        }
    }
}
