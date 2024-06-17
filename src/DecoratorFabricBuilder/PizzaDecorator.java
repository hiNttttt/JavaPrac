package DecoratorFabricBuilder;

abstract class PizzaDecorator extends Pizza {
    protected Pizza pizza;

    public PizzaDecorator(Pizza pizza) {
        this.pizza = pizza;
    }

    public abstract String getDescription();
}

class Cheese extends PizzaDecorator {
    public Cheese(Pizza pizza) {
        super(pizza);
    }

    public String getDescription() {
        return pizza.getDescription() + ", Cheese";
    }

    public double getCost() {
        return pizza.getCost() + 1.5;
    }
}

class Olives extends PizzaDecorator {
    public Olives(Pizza pizza) {
        super(pizza);
    }

    public String getDescription() {
        return pizza.getDescription() + ", Olives";
    }

    public double getCost() {
        return pizza.getCost() + 1.0;
    }
}

class Mushrooms extends PizzaDecorator {
    public Mushrooms(Pizza pizza) {
        super(pizza);
    }

    public String getDescription() {
        return pizza.getDescription() + ", Mushrooms";
    }

    public double getCost() {
        return pizza.getCost() + 1.2;
    }
}
