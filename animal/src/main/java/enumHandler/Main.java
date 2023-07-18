package enumHandler;

public class Main {
    public static void main(String[] args) {

Learning learn = Learning.MULTITHREADING;
switch (learn) {
    case COREJAVA:
        System.out.println("You are learning Core Java");
        break;
    case COLLECTIONS:
        System.out.println("You are learning Collections");
        break;
    case GENERICS:
        System.out.println("You are learning Generics");
        break;
    case JSPANDSERVLETS:
        System.out.println("You are learning JSP and Servlets");
        break;
    case MULTITHREADING:
        System.out.println("You are learning Multithreading");
        break;
    default:
        System.out.println("You are learning nothing");
        break;
}
    }
}
