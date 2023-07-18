package componenrs.computers;

import lombok.Getter;

@Getter
public class Graphic {
    private String brand;
    private int series;
    private int memory;

    public Graphic() {
        this.brand = "Nvidia";
        this.series = 1650;
        this.memory = 4;
    }
    public Graphic(String brand, int series, int memory) {
        this.brand = brand;
        this.series = series;
        this.memory = memory;
    }

    @Override
    public String toString() {
        return "Graphic{" +
                "brand='" + brand + '\'' +
                ", series=" + series +
                ", memory=" + memory +
                '}';
    }
}
