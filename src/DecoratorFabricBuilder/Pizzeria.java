package DecoratorFabricBuilder;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Pizzeria {
    private static Scanner scanner = new Scanner(System.in);
    private static PizzaFactory pizzaFactory = new SimplePizzaFactory();

    public static void main(String[] args) {

        showMenu();

        Pizza pizza = null;
        switch (getUserChoice()) {
            case 1:
                pizza = pizzaFactory.createPizza("FourCheese");
                break;
            case 2:
                pizza = pizzaFactory.createPizza("Hawaiian");
                break;
            case 3:
                pizza = pizzaFactory.createPizza("Pepperoni");
                break;
            default:
                System.out.println("Неверный вариант. Пожалуйста попробуйте снова.");
                return;
        }

        boolean addingIngredients = true;
        while (addingIngredients) {
            System.out.println("Do you want to add ingredients?");
            System.out.println("1. Cheese");
            System.out.println("2. Olives");
            System.out.println("3. Mushrooms");
            System.out.println("4. No more ingredients");
            System.out.print("Enter your choice: ");

            switch (getUserChoice()) {
                case 1:
                    pizza = new Cheese(pizza);
                    break;
                case 2:
                    pizza = new Olives(pizza);
                    break;
                case 3:
                    pizza = new Mushrooms(pizza);
                    break;
                case 4:
                    addingIngredients = false;
                    break;
                default:
                    System.out.println("Неверный вариант. Пожалуйста попробуйте снова.");
            }
        }


        PizzaBuilder pizzaBuilder = new PizzaBuilder();
        System.out.println("Please select the type of dough:");
        System.out.println("1. Thin");
        System.out.println("2. Thick");
        System.out.print("Enter your choice: ");

        Dough dough = null;
        switch (getUserChoice()) {
            case 1:
                dough = new Dough("Thin Dough");
                break;
            case 2:
                dough = new Dough("Thick Dough");
                break;
            default:
                System.out.println("Неверный вариант. Пожалуйста попробуйте снова.");
                return;
        }

        pizzaBuilder.setDough(dough).setPizza(pizza);
        Pizza customPizza = pizzaBuilder.build();

        // Вывод итогового состава пиццы и её стоимости
        System.out.println("Your custom pizza: " + customPizza.getDescription() + " with " + dough);
        System.out.println("Total cost: " + customPizza.getCost());
    }

    private static int getUserChoice() {
        while (true) {
            try {
                int choice = scanner.nextInt();
                scanner.nextLine();  // Consume newline
                return choice;
            } catch (InputMismatchException e) {
                System.out.println("Неверный ввод.");
                scanner.nextLine();  // Clear the invalid input
            }
        }
    }

    private static void showMenu() {
        System.out.println("Welcome to the Pizzeria!");
        System.out.println("Please select a pizza:");
        System.out.println("1. Four Cheese");
        System.out.println("2. Hawaiian");
        System.out.println("3. Pepperoni");
        System.out.print("Enter your choice: ");
    }
}


