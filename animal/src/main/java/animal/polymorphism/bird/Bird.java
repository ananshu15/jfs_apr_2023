package animal.polymorphism.bird;

import animal.polymorphism.ani.Animal;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@NoArgsConstructor
public class Bird extends Animal {

    protected boolean feather = true;
    protected boolean canFly = true;

    public Bird(boolean feather, boolean canFly) {
        this.feather = true;
        this.canFly = true;
    }

    @Override
    public String showInfo() {
        return "Bird{" +
                "feather=" + feather +
                ", canFly=" + canFly +
                '}';
    }
}
