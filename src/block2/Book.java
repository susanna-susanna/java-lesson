package block2;

class Book {
    Author author;
    String name;
    int pages;
    int year;
    static int bookAmount = 0;

    Book (Author author, String name, int pages, int year) {
        this.author = author;
        this.name = name;
        this.pages = pages;
        this.year = year;
        bookAmount++;
    }

    public String toString(){
        return "Автор: " + author + ", Название: " + name + ", Страниц: " + pages + ", Год: " + year;
    }
}

