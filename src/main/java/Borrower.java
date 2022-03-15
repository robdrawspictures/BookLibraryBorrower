import java.util.ArrayList;

public class Borrower {

    private ArrayList<Book> collection;

    public Borrower(){
        this.collection = new ArrayList<>();
    }

    public int collectionCount(){
        return this.collection.size();
    }

    public void addBook(Book book){
        this.collection.add(book);
    }

    public void borrowBook(Library library){
        addBook(library.checkOutBook());
    }
}
