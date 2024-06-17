package DecoratorFabricBuilder;

class Dough {
    private String doughType;

    public Dough(String doughType) {
        this.doughType = doughType;
    }

    public String getDoughType() {
        return doughType;
    }

    @Override
    public String toString() {
        return doughType;
    }
}

class PizzaBuilder {
    private Dough dough;
    private Pizza pizza;

    public PizzaBuilder setDough(Dough dough) {
        this.dough = dough;
        return this;
    }

    public PizzaBuilder setPizza(Pizza pizza) {
        this.pizza = pizza;
        return this;
    }

    public Pizza build() {
        System.out.println("Building pizza with " + dough);
        return pizza;
    }
}


