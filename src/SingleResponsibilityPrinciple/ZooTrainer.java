package SingleResponsibilityPrinciple;

import java.util.List;

public class ZooTrainer {
    private List<Animal> animals;

    public ZooTrainer(List<Animal> animals) {
        this.animals = animals;
    }

    public void teachAnimalSounds() {
        for (Animal animal : animals) {
            animal.makeSound();
        }
    }
}

