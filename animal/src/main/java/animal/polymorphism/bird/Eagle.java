package animal.polymorphism.bird;

public class Eagle extends Bird{
    @Override
    public String showInfo() {
        return "Eagle{" +
                "feather=" + feather +
                ", canFly=" + canFly +
                '}';
    }
}
