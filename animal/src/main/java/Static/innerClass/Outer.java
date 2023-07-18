package Static.innerClass;

public class Outer {
private static int y= 10;
private static void testOuter() {
    System.out.println("Outer method is executed successfully");
}
    public static void testOuterMethod() {
        System.out.println("Value of x: " + Inner.x);
        Inner.testInnerMethod();
    }

    public static class Inner {
        public static int x= 15;
        public static void testInnerMethod() {
            System.out.println("Inner method is executed successfully");
            System.out.println("Value of y: " + y);
        }
        public static void testInner() {
            Outer.testOuter();
        }

    }
}
