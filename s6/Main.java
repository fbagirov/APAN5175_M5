package s6;


public class Main {
    public static void main(String[] args) {
        LibraryItem i1 = new Book("Clean Code", "Robert C. Martin");
        LibraryItem i2 = new DVD("Inception", 148);

        System.out.println(i1 + " loan days: " + i1.getLoanPeriodDays()); // dynamic
        System.out.println(i2 + " loan days: " + i2.getLoanPeriodDays());

        i1.checkOut();
        i1.returnItem();
    }
}
