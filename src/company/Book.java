package company;

public class Book {
    String name;
    String author;
    int foundationYear;
    int numberOfPage;
    int numberOfBooks;

    public Book(String name, String author, int foundationYear, int numberOfPage) {
        this.name = name;
        this.author = author;
        this.foundationYear = foundationYear;
        this.numberOfPage = numberOfPage;

    }

    public Book(String author, int numberOfBooks) {
        this.name = name;
        this.author = author;
        this.foundationYear = foundationYear;
        this.numberOfBooks = numberOfBooks;
    }

    public String toString() {
        return "Всего книг автора :" + this.author + ",, " + this.numberOfBooks;
    }
}


