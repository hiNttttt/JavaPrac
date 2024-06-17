package DecoratorFabricBuilder;

abstract class PizzaFactory {
    public abstract Pizza createPizza(String type);

    public Pizza orderPizza(String type) {
        Pizza pizza = createPizza(type);
        System.out.println("Creating a " + pizza.getDescription());
        return pizza;
    }
}

class SimplePizzaFactory extends PizzaFactory {
    public Pizza createPizza(String type) {
        Pizza pizza = null;

        if (type.equals("FourCheese")) {
            pizza = new FourCheesePizza();
        } else if (type.equals("Hawaiian")) {
            pizza = new HawaiianPizza();
        } else if (type.equals("Pepperoni")) {
            pizza = new PepperoniPizza();
        }

        return pizza;
    }
}
