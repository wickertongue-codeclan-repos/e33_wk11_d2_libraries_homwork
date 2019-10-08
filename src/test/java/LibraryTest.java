import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    private Library library;
    private Book book;

    @Before

    public void before(){
        library = new Library();
        book = new Book("Pale Fire", "Vladimir Nabokov", "Literary Theory" );
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


}
