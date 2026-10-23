import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //beginning of book list setup

        ArrayList<Book> books = new ArrayList<>();

        Book HP = new Book("Harry Potter",
                1,
                "978-0590353403",
                false,
                null);

        Book TMR = new Book ("The Maze Runner",
                2,
                "978-0-385-73794-4",
                false,
                null);

        Book Hob = new Book ("The Hobbit",
                3,
                "978-0547928227",
                false,
                null);

        books.add(HP);
        books.add(TMR);
        books.add(Hob);

        //end of book list setup

        TMR.checkOut("Shawn");
    }
}
