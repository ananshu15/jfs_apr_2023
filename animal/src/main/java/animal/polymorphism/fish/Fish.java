package animal.polymorphism.fish;

import animal.polymorphism.ani.Animal;


public class Fish extends Animal {

    protected boolean waterBone = true;
    protected boolean gills = true;


    public Fish() {
        animalType = "Fish";
        this.waterBone = true;
        this.gills = true;
    }

    @Override
    public String showInfo() {
        return "Fish{" +
                "waterBone=" + waterBone +
                ", gills=" + gills +
                ", animalType='" + this.animalType + '\'' +
                '}';
    }
}
