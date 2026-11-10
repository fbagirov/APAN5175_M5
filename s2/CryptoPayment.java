package s2;

public class CryptoPayment extends Payment {
    private String network;

    public CryptoPayment(double amount, String currency, String network) {
        super(amount, currency);
        this.network = network; // TODO
    }

    @Override
    public double getFee() {
        // TODO: return flat network fee (example 1.50)
        return 1.50;
    }

    @Override
    public void process() {
        // TODO: print crypto-specific processing message + call super.process() if you want
        System.out.println("Processing crypto on " + network);
        super.process();
    }
}