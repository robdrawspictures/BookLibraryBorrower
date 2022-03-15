import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookTest {

    private Book book;

    @Before
    public void before(){
        book = new Book("The Shining", "Stephen King", "Horror");
    }

    @Test
    public void hasTitle(){
        assertEquals("The Shining", book.getTitle());
    }

    @Test
    public void hasAuthor(){
        assertEquals("Stephen King", book.getAuthor());
    }
    @Test
    public void hasGenre(){
        assertEquals("Horror", book.getGenre());
    }
}
