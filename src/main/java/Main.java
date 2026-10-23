import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //beginning of book list setup

        ArrayList<Book> books = new ArrayList<>();

        Book HP = new Book(1,
                "978-0590353403",
                false,
                null);

        Book TMR = new Book (2,
                "978-0-385-73794-4",
                false,
                null);

        Book Hob = new Book (3,
                "978-0547928227",
                false,
                null);

        books.add(HP);
        books.add(TMR);
        books.add(Hob);

        //end of book list setup


    }
}
