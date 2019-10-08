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

    public int getGenreCount(Book book) {
        return this.genreCount.get(book.getGenre());
    }

    public int bookCount() {
        return this.books.size();
    }

    public Boolean isGenreInGenreCount(String genre) {
        return this.genreCount.containsKey(genre);
    }

    public void addBook(Book book) {
        if (this.capacity > this.bookCount()) {
            this.books.add(book);

            if (this.isGenreInGenreCount(book.getGenre())) {
                int temp = this.genreCount.get(book.getGenre());
                this.genreCount.put(book.getGenre(), temp + 1);
            } else {
                this.genreCount.put(book.getGenre(), 1);
            }

        }
    }

    public void removeBook(Book book) {
        if (this.isGenreInGenreCount(book.getGenre())) {
            int temp = this.genreCount.get(book.getGenre());
            this.genreCount.put(book.getGenre(), temp - 1);
        } else {
            this.genreCount.put(book.getGenre(), 0);
        }
        this.books.remove(book);
    }

    public void lendBook(Book book, Borrower borrower) {
        if (this.isGenreInGenreCount(book.getGenre())) {
            int temp = this.genreCount.get(book.getGenre());
            this.genreCount.put(book.getGenre(), temp - 1);
        } else {
            this.genreCount.put(book.getGenre(), 0);
        }
        borrower.addBook(book);
        this.removeBook(book);
    }
}
