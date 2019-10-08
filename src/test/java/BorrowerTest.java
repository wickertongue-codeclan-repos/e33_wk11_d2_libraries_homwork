import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BorrowerTest {

    private Borrower borrower;
    private Book book;

    @Before

    public void before(){
        borrower = new Borrower();
        book = new Book("Pale Fire", "Vladamir Nabokov", "Literary Fiction");
    }

    @Test
    public void borrowerStartsWithNoBooks(){
        assertEquals(0, borrower.bookCount());
    }

    @Test
    public void canAddBook(){
        borrower.addBook(book);
    }
}
