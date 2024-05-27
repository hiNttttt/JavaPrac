package Association;

class Customer {
    private String fullName;
    private Car car;

    public Customer(String fullName) {
        this.fullName = fullName;
    }

    public String getFullName() {
        return fullName;
    }

    public void buyCar(Car car) {
        this.car = car;
    }

    public Car getCar() {
        return car;
    }

    @Override
    public String toString() {
        return "Покупатель{Имя='" + fullName + "', машина=" + (car != null ? car.toString() : "none") + "}";
    }
}
//Содержит fullName и ссылку на Car.
//Метод buyCar позволяет назначить машину клиенту.