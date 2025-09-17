public class Loan {
    private String loanId;
    private User user;
    private Book book;
    public Loan(String loanId, User user, Book book) {
        this.loanId = loanId;
        this.user = user;
        this.book = book;
    }

    public String getLoanId() {
        return loanId;
    }
    public User getUser() {
        return user;
    }
    public Book getBook() {
        return book;
    }


    public static void loan(User user, Book book) {
        if (book.getisAvailable()) {
            user.getLoans().add(book);
            user.setAbleToLoan(false);
            book.setisAvailable(false);
            System.out.println(user.getFirstName() + user.getLastName() + " loaned " + book.getTitle());
        }
        else {
            System.out.println("Book is not available");
        }
    }
    public static void returnBook(User user, Book book) {
        user.getLoans().remove(book);
        user.setAbleToLoan(true);
        book.setisAvailable(true);
        System.out.println(user.getFirstName() + user.getLastName() + " returned " + book.getTitle());
    }
}
