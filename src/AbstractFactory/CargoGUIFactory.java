package AbstractFactory;

public class CargoGUIFactory implements GUIFactory {
    public CargoGUIFactory() {
        System.out.println("Creating GUI factory for Cargo cars.");
    }

    @Override
    public Car createCar() {
        System.out.println("Creating Car for Cargo cars.");
        return new Econom();
    }

    @Override
    public Driver createDriver() {
        System.out.println("Creating Driver for Cargo cars.");
        return new carDriver();
    }

    @Override
    public Movement createMovement() {
        System.out.println("Creating ? for Cargo cars.");
        return new Drives();
    }
}

