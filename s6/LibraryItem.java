package s6;


public abstract class LibraryItem {
    protected String title;
    protected boolean isCheckedOut;

    public LibraryItem(String title) {
        this.title = title;
        this.isCheckedOut = false;
    }

    public void checkOut() {
        if (isCheckedOut) {
            System.out.println(title + " is already checked out.");
        } else {
            isCheckedOut = true;
            System.out.println(title + " has been checked out.");
        }
    }

    public void returnItem() {
        if (isCheckedOut) {
            isCheckedOut = false;
            System.out.println(title + " has been returned.");
        } else {
            System.out.println(title + " is already available.");
        }
    }

    public abstract int getLoanPeriodDays();

    @Override
    public String toString() {
        return title + " ("
                + (isCheckedOut ? "checked out" : "available")
                + ")";
    }
}