package animal.polymorphism.main;

import animal.polymorphism.bird.Bird;
import animal.polymorphism.bird.Eagle;
import animal.polymorphism.fish.Eel;
import animal.polymorphism.fish.Fish;
import animal.polymorphism.reptile.Crocodile;
import animal.polymorphism.ani.Animal;
import animal.polymorphism.reptile.Reptile;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        /* Animal animal = new Animal();
        System.out.println(animal.showInfo());

        Reptile reptile = new Reptile();
        System.out.println(reptile.showInfo());

        Crocodile crocodile = new Crocodile();
        System.out.println(crocodile.showInfo());

        Fish fish = new Fish();
        System.out.println(fish.showInfo());

        Eel eel = new Eel();
        System.out.println(eel.showInfo());

        Bird bird = new Bird();
        System.out.println(bird.showInfo());

        Eagle eagle = new Eagle();
        System.out.println(eagle.showInfo()); */

        List<Animal> animals = new ArrayList<>();
        Animal animal = new Animal();
        Reptile reptile = new Reptile();
        Animal crocodile = new Crocodile();
        Animal fish = new Fish();
        Animal eel = new Eel();
        Animal bird = new Bird();
        Animal eagle = new Eagle();

        animals.add(animal);
        animals.add(reptile);
        animals.add(crocodile);
        animals.add(fish);
        animals.add(eel);
        animals.add(bird);
        animals.add(eagle);
        listAnimal(animals);

    }
    public static void listAnimal(List<Animal> animals){
        for (Animal animal : animals){
            System.out.println(animal.showInfo());
        }
    }
}
