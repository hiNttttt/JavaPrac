package DecoratorFabricBuilder;

abstract class Pizza {
    String description = "Unknown Pizza";

    public String getDescription() {
        return description;
    }

    public abstract double getCost();
}

class FourCheesePizza extends Pizza {
    public FourCheesePizza() {
        description = "Four Cheese Pizza";
    }

    public double getCost() {
        return 8.0;
    }
}

class HawaiianPizza extends Pizza {
    public HawaiianPizza() {
        description = "Hawaiian Pizza";
    }

    public double getCost() {
        return 10.0;
    }
}

class PepperoniPizza extends Pizza {
    public PepperoniPizza() {
        description = "Pepperoni Pizza";
    }

    public double getCost() {
        return 9.0;
    }
}
