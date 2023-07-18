package componenrs.computers;

import lombok.Getter;

@Getter
public class Laptop {

    private String brand;
    private Processor processor;
    private Graphic graphic;
    private int ram;
    private int storage;
    private double price;

    public Laptop() {
        this.brand = "Asus";
        this.processor = new Processor();
        this.graphic = new Graphic();
        this.ram = 8;
        this.storage = 512;
        this.price = 500.0;
    }
    public Laptop(String brand, Processor processor, Graphic graphic, int ram, int storage, double price) {
        this.brand = brand;
        this.processor = processor;
        this.graphic = graphic;
        this.ram = ram;
        this.storage = storage;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "brand='" + brand + '\'' +
                ", processor=" + processor +
                ", graphic=" + graphic +
                ", ram=" + ram +
                ", storage=" + storage +
                ", price=" + price +
                '}';
    }
}
