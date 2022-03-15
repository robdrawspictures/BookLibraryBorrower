import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    private Library library;
    private Book bookOne;
    private Book bookTwo;
    private Book bookThree;

    @Before
    public void before(){
        library = new Library(2);
        bookOne = new Book("The Shining", "Stephen King", "Horror");
        bookTwo = new Book("The Lincoln Lawyer", "Michael Connolly", "Thriller");
        bookThree = new Book("Killing Floor", "Lee Child", "Action");
    }

    @Test
    public void hasEmptyLibrary(){
        assertEquals(0, library.getBookCount());
    }

    @Test
    public void canAddBook(){
        library.addBook(bookOne);
        assertEquals(1, library.getBookCount());
    }

    @Test
    public void cantExceedCapacity(){
        library.addBook(bookOne);
        library.addBook(bookTwo);
        library.addBook(bookThree);
        assertEquals(2, library.getBookCount());
    }

//    @Test
//    public void canCheckOutBook(){
//        library.addBook(bookOne);
//        library.checkOutBook("The Shining");
//        assertEquals(0, library.getBookCount());
//    }

    @Test
    public void canCheckOutBook(){
        library.addBook(bookOne);
        library.checkOutBook();
        assertEquals(0, library.getBookCount());
    }

    @Test
    public void canCountSpecificGenre(){
        assertEquals(0, library.getGenreCount("Horror"));
    }

//    @Test
//    public void canIncreaseGenreCount(){
//        library.addBook(bookOne);
//        library.increaseGenreCount();
//        assertEquals(1, library.getGenreCount("Horror"));
//    }

}
