import java.util.ArrayList;

public class Library {

    private int capacity;
    private ArrayList<Book> books;

    public Library(){
        this.capacity = 5;
        this.books = new ArrayList<Book>();
    }

    public int getCapacity() {
        return this.capacity;
    }

    public int bookCount() {
        return this.books.size();
    }


}
