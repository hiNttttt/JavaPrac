package SingleResponsibilityPrinciple;

import java.util.Arrays;
import java.util.List;

public class Homework9 {
    public static void main(String[] args) {

        List<Animal> animals = Arrays.asList(
                new Dog("Пёсель"),
                new Cat("Наус"),
                new Cow("Зина")
        );

        ZooTrainer trainer = new ZooTrainer(animals);
        trainer.teachAnimalSounds();
    }
}

