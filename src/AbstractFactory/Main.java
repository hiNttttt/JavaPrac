package AbstractFactory;

import java.util.Scanner;
import java.util.InputMismatchException;


public class Main {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        GUIFactory factory;

        System.out.println("Выберите такси:");
        System.out.println("1. Эконом");
        System.out.println("2. Грузовое");
        System.out.println("3. Мотоцикл");
        System.out.print("Выберите вариант: ");


        try {
            int choice = scanner.nextInt();
            if (choice == 1) {
                factory = new EconomGUIFactory();
            } else if (choice == 2) {
                factory = new CargoGUIFactory();
            } else if (choice == 3) {
                factory = new MotorbikeGUIFactory();
            } else {
                System.out.println("Неверный ввод. Введите цифру от 1 до 3.");
                return;
            }
            Application application = new Application(factory);

        } catch (InputMismatchException e) {
            System.out.println("Неверный ввод. Введите цифру от 1 до 3.");
        }
    }
}

