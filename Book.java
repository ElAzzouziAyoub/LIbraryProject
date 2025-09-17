public class Book {
    private int Isbn;
    private int BookID;
    private boolean isLoeaned;
    private String Title;
    private String Author;

    Book(int ISBN,int BookID , String Title,String Author){
        this.Isbn = ISBN;
        this.BookID = BookID;
        this.Title = Title;
        this.Author = Author;
    }

    public String getAuthor(){
        return this.Author;
    }
    public void setAuthor(String Author){
        this.Author = Author;
    }

    public String getTitle(){
        return this.Title;
    }
    public void setTitle(String Title){
        this.Title = Title;
    }

    public boolean isLoeaned(){
        return this.isLoeaned;
    }
    private int getIsbn(){
        return this.Isbn;
    }



}
