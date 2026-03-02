package s2;

public class CreditCardPayment extends Payment {
    private String last4;

    public CreditCardPayment(double amount, String currency, String last4) {
        super(amount, currency);
        // TODO
    }

    @Override
    public double getFee() {
        // TODO: return 2.9% + 0.30 (example)
        return 0;
    }

    @Override
    public void process() {
        // TODO: print CC-specific processing message + call super.process() if you want
    }
}