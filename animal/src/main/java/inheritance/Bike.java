package inheritance;

public class Bike extends Vehicle {
    private String handle;

    public Bike() {
        super();
        this.handle= "Short";
    }

    public Bike(String handle) {
        this.handle = handle;
    }

    public String getHandle() {
        return handle;
    }
}
