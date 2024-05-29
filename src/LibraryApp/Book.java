package LibraryApp;

public class Book {
    private static String title;
    private static String author;
    private static int year;

    public Book (String title, String author, int year){
        this.title = title;
        this.author = author;
        this.year = year;
    }
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getYear() {
        return year;
    }
    @Override
    public String toString() {
        return "Книга {Название: " + title + ", автор: " + author + ", год публикации: " + year +".}";
    }
}
