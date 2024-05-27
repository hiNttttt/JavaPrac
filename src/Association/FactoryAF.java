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