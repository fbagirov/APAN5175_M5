package s6;


public class Book extends LibraryItem {
    private String author;

    public Book(String title, String author) {
        super(title);
        // TODO
    }

    @Override
    public int getLoanPeriodDays() {
        // TODO return 21 (example)
        return 0;
    }
}