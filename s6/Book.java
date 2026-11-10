package s6;


public class Book extends LibraryItem {
    private String author;

    public Book(String title, String author) {
        super(title);
        this.author = author;
    }

    @Override
    public int getLoanPeriodDays() {
        // TODO return 21 (example)
        return 21;
    }
}