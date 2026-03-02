package s6;


public abstract class LibraryItem {
    protected String title;
    protected boolean isCheckedOut;

    public LibraryItem(String title) {
        // TODO
    }

    public void checkOut() {
        // TODO
    }

    public void returnItem() {
        // TODO
    }

    public abstract int getLoanPeriodDays();

    @Override
    public String toString() {
        // TODO
        return "TODO";
    }
}