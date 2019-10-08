import java.util.ArrayList;
import java.util.HashMap;

public class Library {

    private int capacity;
    private ArrayList<Book> books;
    private HashMap<String, Integer> genreCount;

    public Library(){
        this.capacity = 5;
        this.books = new ArrayList<Book>();
        this.genreCount = new HashMap<String, Integer>();
    }

    public int getCapacity() {
        return this.capacity;
    }

    public int bookCount() {
        return this.books.size();
    }

    public Boolean isGenreInNumBooksInGenre(Book book) {
        if (this.genreCount.get(book.getGenre())) {

        } else {

        }
    }

    public void addBook(Book book) {
        if (this.capacity > this.bookCount()) {
            this.books.add(book);
            if (this.genreCount.get(book.getGenre());

            this.genreCount.put(book.getGenre(), +1);
        }
    }

    public void removeBook(Book book) {
        this.books.remove(book);
    }

    public void lendBook(Book book, Borrower borrower) {
        borrower.addBook(book);
        this.removeBook(book);
    }
}
