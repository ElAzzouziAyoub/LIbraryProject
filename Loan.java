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

    public void loan(User user, Book book) {
        user.getLoans().add(book);
        user.setAbleToLoan(true);

    }
    public void returnBook(Book book) {
        user.getLoans().remove(book);
        user.setAbleToLoan(false);
    }
}
