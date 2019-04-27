package block2;

class Author {
    String name;
    String surname;
    int birthday;
    String country;

    Author (String name, String surname, int birthday, String country) {
        this.name = name;
        this.surname = surname;
        this.birthday = birthday;
        this.country = country;
    }

    public String toString() {
        return "Автор: " + name + " " + surname + ", " + country;
    }
}
