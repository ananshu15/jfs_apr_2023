package componenrs.computers;

import lombok.Getter;

@Getter
public class Processor {
    private String brand;
    private String model;
    private double frequency;
    private int cores;

    public Processor() {
        this.brand = "Intel";
        this.model = "Core i5-1035G1";
        this.frequency = 1.0;
        this.cores = 4;
    }
    public Processor(String brand, String model, double frequency, int cores) {
        this.brand = brand;
        this.model = model;
        this.frequency = frequency;
        this.cores = cores;
    }

    @Override
    public String toString() {
        return "Processor{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", frequency=" + frequency +
                ", cores=" + cores +
                '}';
    }
}
