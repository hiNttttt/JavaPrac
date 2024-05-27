package Association;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class FactoryAF {
    private List<Customer> customers;
    private List<Car> cars;

    public FactoryAF() {
        customers = new ArrayList<>();
        cars = new ArrayList<>();
    }

    public void addCustomer(Customer customer) {
        customers.add(customer);
    }

    public void produceCar(int pedalSize) {
        cars.add(new Car(pedalSize));
    }

    public void saleCar() {
        System.out.println("\nДо продаж:");
        displayInfo();

        Iterator<Customer> customerIterator = customers.iterator();

        while (customerIterator.hasNext() && !cars.isEmpty()) {
            Customer customer = customerIterator.next();
            if (customer.getCar() == null) {
                Car car = cars.remove(0);
                customer.buyCar(car);
                System.out.println("Покупатель " + customer.getFullName() + " Купил машину с серийным номером: " + car.getSerialNumber());
            }
        }

        if (!cars.isEmpty()) {
            System.out.println("Не все машины были проданы. Оставшиеся машины будут ликвидированы.");
            cars.clear();
        }
        System.out.println("\nПосле продаж:");
        displayInfo();
    }
    public void displayInfo() {
        System.out.println("Машины в наличии:");
        for (Car car : cars) {
            System.out.println(car);
        }
        System.out.println("\nПокупатели:");
        for (Customer customer : customers) {
            System.out.println(customer);
        }
    }
}
//Содержит списки клиентов и машин.
//Метод addCustomer добавляет клиентов.
//Метод produceCar создает машины.
//Метод saleCar:
//Проходит по списку клиентов и выдает машины.
//Удаляет выданные машины из списка.
//Если остаются непроданные машины, они ликвидируются (список очищается).
//Метод displayInfo: Этот метод выводит информацию об автомобилях на складе и клиентах.
//Вызов displayInfo до и после продажи: Мы вызываем этот метод перед и после выполнения метода saleCar, чтобы показать состояние автомобилей и клиентов до и после продажи.
//Переопределение метода toString: В классах Car и Customer добавлены методы toString для более удобного вывода информации.