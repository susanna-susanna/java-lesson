package block2;


public class Homework212 {
    public static void main(String[] args) {
        Author author1 = new Author("Leo", "Tolstoy", 1828, "Russia");
        Book book1 = new Book(author1, "War and peace", 1225, 1867);
        User user1 = new User("ivanov@mail.ru", "Ivav", "Ivanov", book1);

        System.out.println("Пользователь: " + user1);
    }

}

/*class Homework213<pablic> {
    static int totalOnline = 0;

    void Homework213() {
        totalOnline++;
    }
    public static void main(String[] args) {

        User user1 = new User("firstname@mail", "Ваня", "Иванов");
        User user2 = new User("secondname@mail", "Петя", "Петров");
        User user3 = new User("thirdname@mail", "Вася", "Васильев");
        System.out.println("Количество нлайн-посетителей: " + Homework213.totalOnline);

    }
}*/
