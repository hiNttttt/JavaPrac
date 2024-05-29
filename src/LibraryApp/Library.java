package LibraryApp;

import java.util.ArrayList;
import java.util.List;

public class Library {
    static List<Book> books;

    public Library() {
        books = new ArrayList<>();
    }

    public void addBook(String title, String author, int year) {
        Book book = new Book(title, author, year);
        books.add(book);
        System.out.println("Книга добавлена в библиотеку.");

    }
    public void viewBooks() {
        if (books.isEmpty()){
            System.out.println("Библиотека пуста.");
        }else {
            for (Book book : books)
                System.out.println(book);
        }
    }
    public Book findBookByTitle(String title){
        for (Book book : books){
            if (book.getTitle().equalsIgnoreCase(title)){
                return book;
            }
        }
        return null;
    }
    public boolean removeBookByTitle(String title) {
        Book book = findBookByTitle(title);
        if (book != null){
            books.remove(book);
            System.out.println("Книга удалена из библиотеки.");
            return true;
        }else {
            System.out.println("Книга не найдена.");
            return false;
        }
    }
}
