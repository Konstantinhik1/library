import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book<String>> books = new ArrayList<>();

    public void addBook(Book<String> book) {
        books.add(book);
    }

    public void issueBook(Book<String> book) {
        if (books.contains(book)) {
            books.remove(book);
            System.out.println("Выдана книга: " + book.getTitle());
        } else {
            System.out.println("Книга не найдена");
        }
    }

    public void displayIssuedBooks() {
        System.out.println("Выданные книги:");
        for (Book<String> book : books) {
            System.out.println(book.getTitle());
        }
    }

    public static void main(String[] args) {
        Library library = new Library();

        Book<String> book1 = new Book<>();
        book1.setTitle("Гарри Поттер");
        Book<String> book2 = new Book<>();
        book2.setTitle("Портрет Дориана Грея");
        Book<String> book3 = new Book<>();
        book3.setTitle("Вино из одуванчиков");

        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);

        library.displayIssuedBooks();

        library.issueBook(book2);

        library.displayIssuedBooks();
    }
}