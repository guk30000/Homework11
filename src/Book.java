public class Book {

    private String bookName;
    private Author author;
    private int dateOfPublication;

    public Book(String bookName, Author author, int dateOfPublication) {
        this.bookName = bookName;
        this.author = author;
        this.dateOfPublication = dateOfPublication;
    }

    public String getBookName() {
        return  bookName;
    }

    public Author getAuthor() {
        return author;
    }

    public int getDateOfPublication() {
        return dateOfPublication;
    }

    public void setDateOfPublication(int dateOfPublication) {
        this.dateOfPublication = dateOfPublication;
    }
}
