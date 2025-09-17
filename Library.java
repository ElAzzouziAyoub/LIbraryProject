import java.util.ArrayList;
public class Library {
    private ArrayList<Book> books;

    public void AddBook(Book book) {
        books.add(book);
        System.out.println("Book "+book.getTitle()+"has been added");
    }
    public ArrayList<Book> getBooks() {
        return books;
    }
    public void removeBook(Book book) {
        books.remove(book);
        System.out.println("Book "+book.getTitle()+"has been removed");
        book.setisAvailable(false);
    }
    public void displayBooks(){
        for (Book book : books) {
            book.displayInfo();

        }
    }
}
