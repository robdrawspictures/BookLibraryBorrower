import java.util.ArrayList;
import java.util.HashMap;

public class Library {

    private ArrayList<Book> library;
    private int capacity;
    private HashMap<String, Integer> genreCount;

    public Library(int capacity){
        this.capacity = capacity;
        this.library = new ArrayList<>();
        this.genreCount = new HashMap<>();
        this.genreCount.put("Horror", 0);
    }

    public int getBookCount(){
        return this.library.size();
    }

    public void addBook(Book book){
        if(getBookCount() < this.capacity){
            this.library.add(book);
        }
    }

//    public Book checkOutBook(String title){
//        Book foundBook = null;
//        for(Book book : this.library){
//            if(book.getTitle().equals(title)){
//                foundBook = book;
//                this.library.remove(book);
//            }
//        }
//        return foundBook;
//    }

    public Book checkOutBook(){
        return this.library.remove(0);
    }

    public int getGenreCount(String genre){
        return genreCount.get(genre);
    }

//    public void increaseGenreCount(String genre){
//        for(Book book : this.library){
//            if(book.getGenre().equals(genreCount.)){
//
//                genreCount.put(++);
//            }
//        }
//    }
}
