import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class BorrowerTest {

    private Borrower borrower;
    private Book bookOne;
    private Book bookTwo;
    private Book bookThree;
    private Library library;

    @Before
    public void before(){
        borrower = new Borrower();
        library = new Library(5);
        bookOne = new Book("The Shining", "Stephen King", "Horror");
        bookTwo = new Book("The Lincoln Lawyer", "Michael Connolly", "Thriller");
        bookThree = new Book("Killing Floor", "Lee Child", "Action");
    }

    @Test
    public void hasEmptyCollection(){
        assertEquals(0, borrower.collectionCount());
    }

    @Test
    public void canAddBook(){
        borrower.addBook(bookOne);
        assertEquals(1, borrower.collectionCount());
    }

    @Test
    public void canBorrowBook(){
        library.addBook(bookOne);
        borrower.borrowBook(library);
        assertEquals(0, library.getBookCount());
        assertEquals(1, borrower.collectionCount());
    }
}
