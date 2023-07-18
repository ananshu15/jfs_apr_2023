package javafundamental;

public class typeCasting {
    public static void main(String[] args) {
        byte b1 = 10;         //implicit type casting
        int b2 = b1;
        System.out.println(b2);

        int b3 = 20;          //explicit type casting
        byte b4 = (byte)b3;
        System.out.println(b4);
    }
}
