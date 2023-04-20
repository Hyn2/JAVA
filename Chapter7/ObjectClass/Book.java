package Chapter7.ObjectClass;

public class Book {
    private String title;
    private String isbn;
    public Book(String title, String isbn) {
        this.title = title;
        this.isbn = isbn;
    }

    @Override
    public String toString() {
        return "ISBN : " + isbn + "; TITLE : " + title + "; ";
    }

}