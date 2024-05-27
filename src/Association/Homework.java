package Association;

public class Homework {
    public static void main(String[] args) {
        FactoryAF factory = new FactoryAF();

        // Добавление клиентов
        factory.addCustomer(new Customer("Иван Иванов"));
        factory.addCustomer(new Customer("Петр Петров"));
        factory.addCustomer(new Customer("Сидор Сидоров"));

        // Производство автомобилей
        factory.produceCar(5);
        factory.produceCar(10);
        factory.produceCar(15);

        System.out.println("Начальная фаза:");
        factory.displayInfo();

        // Продажа автомобилей
        factory.saleCar();
    }
}

