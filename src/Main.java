import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        Author author1 = new Author("Чак", "Паланик");
        Author author2 = new Author("Дмитрий", "Глуховский");

        Book book1 = new Book("Бойцовский клуб", author1, 1996);
        Book book2 = new Book("Метро 2033", author2, 2002);

        System.out.println(book1);
        System.out.println(book2);
        System.out.println(book1.equals(book2));
        System.out.println(author1.equals(author2));
        System.out.println(book1.hashCode());
        System.out.println(author1.hashCode());
    }

}
