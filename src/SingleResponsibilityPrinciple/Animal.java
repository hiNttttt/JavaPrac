package SingleResponsibilityPrinciple;

public abstract class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    // Абстрактный метод, который будет реализован в подклассах
    public abstract void makeSound();
}


