package block2;

public class User {
    String email;
    String name;
    String surname;
    Book book;
    static int totalUser = 0;

    public User(String email, String name, String surname, Book book) {
        this.email = email;
        this.name = name;
        this.surname = surname;
        this.book = book;
        totalUser++;
    }

    public String toString(String email, String name, String surname) {
        return "Пользователь: " + name + surname + "адрес: " + email;
    }
}
