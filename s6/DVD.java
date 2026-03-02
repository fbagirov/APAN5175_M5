package s6;

public class DVD extends LibraryItem {
    private int durationMinutes;

    public DVD(String title, int durationMinutes) {
        super(title);
        // TODO
    }

    @Override
    public int getLoanPeriodDays() {
        // TODO return 7 (example)
        return 0;
    }
}
