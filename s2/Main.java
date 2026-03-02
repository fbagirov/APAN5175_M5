package s2;

public class Main {
    public static void main(String[] args) {
    Payment p1 = new CreditCardPayment(100.00, "USD", "1234");
    Payment p2 = new CryptoPayment(100.00, "USD", "Ethereum");

    p1.process(); // runtime picks overridden methods
    System.out.println("----");
    p2.process();
}
}
