package componenrs.computers;

public class Main {
    public static void main(String[] args) {
        Laptop laptop = new Laptop();
        System.out.println(laptop);
        System.out.println(laptop.getProcessor());
        System.out.println(laptop.getProcessor().getModel());
        System.out.println(laptop.getGraphic());
        System.out.println(laptop.getGraphic().getBrand());

        Laptop laptop2 = new Laptop("Lenovo",
                new Processor("AMD", "Ryzen 5 4600H", 3.0, 6),
                new Graphic("AMD", 1650, 4), 16, 512, 700.0);
        System.out.println(laptop2);



    }
}
