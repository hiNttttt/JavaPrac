package AbstractFactory;

public class Application {
    private Car car;
    private Driver driver;
    private Movement movement;

    public Application(GUIFactory factory) {
        System.out.println("Создаем заказ");
        car = factory.createCar();
        driver = factory.createDriver();
        movement = factory.createMovement();
    }
}
