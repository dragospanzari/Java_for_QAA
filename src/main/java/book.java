import java.awt.print.Book;

public class book {
    String name = null;
    String author = null;
    String publisher = null;
    String isbn = null;

    public book(String Name, String ISBN, String Author, String Publisher) {
        name = Name;
        author = Author;
        publisher = Publisher;
        isbn = ISBN;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public String getAuthor() {
        return author;
    }
    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }
    public String getPublisher() {
        return publisher;
    }
    public void setISBN(String isbn) {
        this.isbn = isbn;
    }
    public String getISBN() {
        return isbn;
    }
    public void getBookInfo() {
        System.out.println("cartea introdusa este: " + getName() + ", scrisa de: " + getAuthor() + ", Editura: " + getPublisher() + ", Nr identificare: " + getISBN());
    }

}
