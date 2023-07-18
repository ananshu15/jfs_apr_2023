package animal.polymorphism.fish;


public class Eel extends Fish{
private String special;

    public Eel(){
        super();
        this.special = "Electric charge";
    }

    @Override
    public String showInfo() {
        return "Eel{" +
                "special='" + special + '\'' +
                ", waterBone=" + waterBone +
                ", gills=" + gills +
                ", animalType='" + animalType + '\'' +
                '}';
    }
}
