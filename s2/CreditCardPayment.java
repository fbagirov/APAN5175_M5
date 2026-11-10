package s2;

public class CreditCardPayment extends Payment {
    private String last4;

    public CreditCardPayment(double amount, String currency, String last4) {
        super(amount, currency);
        this.last4 = last4; // TODO
    }

    @Override
    public double getFee() {
        return amount * 0.029 + 0.30; // TODO: return 2.9% + 0.30 (example)
    }

    @Override
    public void process() {
        // TODO: print CC-specific processing message + call super.process() if you want
        System.out.println("Processing credit card ending in " + last4);
        super.process();
    }
}