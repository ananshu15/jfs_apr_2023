package animal.polymorphism.reptile;

public class Crocodile extends Reptile{

    public Crocodile(){
        super();
        egg = "hard shelled";
    }

    @Override
    public String showInfo() {
        return "Crocodile{" +
                "skin='" + skin + '\'' +
                ", egg='" + egg + '\'' +
                ", backBone=" + backBone +
                ", height=" + height +
                ", weight=" + weight +
                ", animalType='" + animalType + '\'' +
                ", bloodType='" + bloodType + '\'' +
                '}';
    }
}
