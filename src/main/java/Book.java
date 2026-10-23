public class Book {
    String bookName;
    int id;
    String isbn;
    boolean isCheckedOut;
    String checkedOutTo;

    public Book(String bookName,
                int id,
                String isbn,
                boolean isCheckedOut,
                String checkedOutTo) {

        this.bookName = bookName;
        this.id = id;
        this.isbn = isbn;
        this.isCheckedOut = isCheckedOut;
        this.checkedOutTo = checkedOutTo;
    }

    public void checkOut(String name) {
        this.isCheckedOut = true;
        this.checkedOutTo = name;

        System.out.println("Checked out " + this.bookName + " to: " + name);

    }

    public void checkIn() {
        this.checkedOutTo = "";
        this.isCheckedOut = false;
    }


}
