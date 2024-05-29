package LibraryApp;

import java.util.InputMismatchException;
import java.util.Scanner;

public class LibraryApp {
    private static Library library;
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        library = new Library();

        while (true) {
            showMenu();
            int choice = getUserChoice();
            if (!processChoice(choice)) {
                break;
            }
        }
    }
    private static void showMenu() {
        System.out.println("Меню:");
        System.out.println("1. Добавить книгу");
        System.out.println("2. Список книг");
        System.out.println("3. Найти книгу по названию");
        System.out.println("4. Удалить книгу по названию");
        System.out.println("5. Выйти");
        System.out.println("Введите «назад» в любой строке, чтобы вернуться в главное меню.");
        System.out.print("Выберите вариант: ");
    }

    private static int getUserChoice() {
        while (true) {
            try {
                int choice = scanner.nextInt();
                scanner.nextLine();  // Consume newline
                return choice;
            } catch (InputMismatchException e) {
                System.out.println("Неверный ввод. Введите цифру от 1 до 5.");
                scanner.nextLine();  // Clear the invalid input
            }
        }
    }

    private static boolean processChoice(int choice) {
        switch (choice) {
            case 1:
                addBook();
                break;
            case 2:
                viewBooks();
                break;
            case 3:
                findBookByTitle();
                break;
            case 4:
                removeBookByTitle();
                break;
            case 5:
                System.out.println("Завершение программы.");
                return false;
            default:
                System.out.println("Неверный вариант. Пожалуйста попробуйте снова.");
        }
        return true;
    }

    private static void addBook() {

        System.out.print("Введите название книги: ");
        String title = scanner.nextLine();
        if (title.equalsIgnoreCase("назад")) return;
        System.out.print("Введите автора книги: ");
        String author = scanner.nextLine();
        if (author.equalsIgnoreCase("назад")) return;
        System.out.print("Введите год публикации: ");
        int year;

        while (true) {
            String yearInput = scanner.nextLine();
            if (yearInput.equalsIgnoreCase("назад")) return;
            try {
                year = Integer.parseInt(yearInput);
                break;
            } catch (NumberFormatException e) {
                System.out.println("Неверный формат года. Пожалуйста, введите действительный год или «назад», чтобы вернуться в главное меню.");
            }
        }

        library.addBook(title, author, year);
    }

    private static void viewBooks() {
        library.viewBooks();
    }

    private static void findBookByTitle() {
        System.out.print("Введите название книги для поиска: ");
        String title = scanner.nextLine();
        if (title.equalsIgnoreCase("назад")) return;
        Book book = library.findBookByTitle(title);
        if (book != null) {
            System.out.println("Книга найдена: " + book);
        } else {
            System.out.println("Книга не найдена.");
        }
    }

    private static void removeBookByTitle() {
        System.out.print("Введите название книги для поиска: ");
        String title = scanner.nextLine();
        if (title.equalsIgnoreCase("назад")) return;
        library.removeBookByTitle(title);
    }
}
