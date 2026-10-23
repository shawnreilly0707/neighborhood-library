public class Book {
    int id;
    String isbn;
    boolean isCheckedOut;
    String checkedOutTo;

    public Book(int id,
                String isbn,
                boolean isCheckedOut,
                String checkedOutTo) {

        this.id = id;
        this.isbn = isbn;
        this.isCheckedOut = isCheckedOut;
        this.checkedOutTo = checkedOutTo;
    }

    public void checkOut(String name) {

    }

    public void checkIn() {

    }


}
