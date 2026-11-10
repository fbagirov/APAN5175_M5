package s2;

public abstract class Payment {
    protected double amount;
    protected String currency;

    public Payment(double amount, String currency) {
        this.amount = amount; // TODO
        this.currency = currency; // TODO
    }

    public abstract double getFee();

    public void process() {
        // TODO: print amount, fee, and (amount + fee)
        // Use getFee() so subclass logic is used at runtime
        System.out.println("Amount: " + amount + " " + currency);
        System.out.println("Fee: " + getFee());
        System.out.println("Total: " + (amount + getFee()));
    }
}