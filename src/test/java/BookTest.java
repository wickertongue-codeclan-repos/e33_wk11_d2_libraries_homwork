import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookTest {

    private Book book;

    @Before

    public void before(){
        book = new Book("Pale Fire", "Vladamir Nabokov", "Literary Fiction");
    }

    @Test
    public void bookHasATitle(){
        assertEquals("Pale Fire", book.getTitle());
    }

    @Test
    public void bookHasAnAuthor(){
        assertEquals("Vladamir Nabokov", book.getAuthor());
    }

    @Test
    public void bookHasAGenre(){
        assertEquals("Literary Fiction", book.getGenre());
    }

}
