package javafundamental;

public class methodOverloading {
    public static void main(String[] args) {
        System.out.println("Area of Rectangle is "+ area(2.5,6.7));
        System.out.println("Area of Square is " + area(15.5));
        System.out.println("Area of triangle is "+ area(4.5d,3));
    }

    public static double area(double length, double width){
        return length * width;
    }
    // A method can have a same name but either the return type or one of parameter should be different

    public static double area(double side){
        return side * side;
    }
    public static double area(double base, int height){
        return ((base * height)/2);
    }
}
