import java.util.Objects;

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

    @Override
    public String toString() {
        return "Название книги: " + bookName + ". Автор: " + getAuthor().getFirstName() + " " + getAuthor().getLastName() + ". Дата публикации: " + dateOfPublication;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(dateOfPublication, book.dateOfPublication) && Objects.equals(bookName, book.bookName) && Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(bookName, author, dateOfPublication);
    }
}
