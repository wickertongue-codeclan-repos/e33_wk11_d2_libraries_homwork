import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    private Library library;
    private Book book;
    private Book book1;
    private Borrower borrower;

    @Before
    public void before(){
        library = new Library();
        book = new Book("Pale Fire", "Vladimir Nabokov", "Literary Theory" );
        book1 = new Book("Dune Messiah", "Robert Herbert", "Science Fiction");
        borrower = new Borrower();
    }

    @Test
    public void libraryHasCapacity(){
        assertEquals(5, library.getCapacity());
    }

    @Test
    public void libraryStartsWithZeroBooks(){
        assertEquals(0, library.bookCount());
    }

    @Test
    public void canAddBookToLibrary(){
        library.addBook(book);
        library.addBook(book);
        assertEquals(2, library.bookCount());
    }

    @Test
    public void cannotAddBookToLibraryIfCapacityIsFull(){
        library.addBook(book);
        library.addBook(book);
        library.addBook(book);
        library.addBook(book);
        library.addBook(book);
        library.addBook(book);
        library.addBook(book);
        library.addBook(book);
        assertEquals(5, library.bookCount());
    }

    @Test
    public void canRemoveBookFromBooksInLibrary(){
        library.addBook(book);
        library.addBook(book1);
        library.removeBook(book);
        assertEquals(1, library.bookCount());
    }

    @Test
    public void libraryCanLendBookToBorrower(){
        library.addBook(book);
        library.addBook(book);
        library.addBook(book);
        library.lendBook(book, borrower);
        assertEquals(2, library.bookCount());
        assertEquals(1, borrower.bookCount());
    }


}
