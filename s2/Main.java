class Payment {
    protected double amount;
    protected String currency;

    public Payment(double amount, String currency) {
        this.amount = amount;
        this.currency = currency;
    }

    public double getFee() {
        return 0;
    }

    public void process() {
        double fee = getFee();
        double netCharged = amount + fee;

        System.out.println("Amount: " + amount + " " + currency);
        System.out.println("Fee: " + fee + " " + currency);
        System.out.println("Net charged: " + netCharged + " " + currency);
    }
}

class CreditCardPayment extends Payment {
    private String last4;

    public CreditCardPayment(double amount, String currency, String last4) {
        super(amount, currency);
        this.last4 = last4;
    }

    @Override
    public double getFee() {
        return amount * 0.029 + 0.30;
    }

    @Override
    public void process() {
        System.out.println("=== Credit Card Payment ===");
        System.out.println("Card ending in: " + last4);
        super.process();
        System.out.println();
    }
}

class CryptoPayment extends Payment {
    private String network;

    public CryptoPayment(double amount, String currency, String network) {
        super(amount, currency);
        this.network = network;
    }

    @Override
    public double getFee() {
        return 1.50; // Flat network fee
    }

    @Override
    public void process() {
        System.out.println("=== Crypto Payment ===");
        System.out.println("Network: " + network);
        super.process();
        System.out.println();
    }
}

public class Main {
    public static void main(String[] args) {

        Payment p = new CreditCardPayment(100.00, "USD", "4242");
        Payment q = new CryptoPayment(100.00, "USD", "Ethereum");

        p.process();
        q.process();
    }
}

