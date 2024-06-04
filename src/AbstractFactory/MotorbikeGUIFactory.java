package AbstractFactory;

public class MotorbikeGUIFactory implements GUIFactory {
    public MotorbikeGUIFactory() {
        System.out.println("Creating GUI factory for Econom cars.");
    }

    @Override
    public Car createCar() {
        System.out.println("Creating Car for Econom cars.");
        return new Econom();
    }

    @Override
    public Driver createDriver() {
        System.out.println("Creating Driver for Econom cars.");
        return new carDriver();
    }

    @Override
    public Movement createMovement() {
        System.out.println("Creating ? for Econom cars.");
        return new Drives();
    }
}

