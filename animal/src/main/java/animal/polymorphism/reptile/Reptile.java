package animal.polymorphism.reptile;

import animal.polymorphism.ani.Animal;
import lombok.Getter;

@Getter
public class Reptile extends Animal {
    protected String skin, egg;
    protected boolean backBone;


    public Reptile() {
        height = 5;
        weight = 20;
        animalType = "Reptile";
        bloodType = "Cold";
        this.skin = "Dry skin";
        this.egg = "Soft Shelled";
        this.backBone = true;
    }

    @Override
    public String showInfo() {
        return "Reptile{" +
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
