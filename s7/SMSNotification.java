package s7;



public class SMSNotification extends Notification {
    private String carrier;

    public SMSNotification(String recipient, String carrier) {
        super(recipient);
        this.carrier = carrier;
    }

    @Override
    public String getChannelName() {
        // TODO
        return "SMS";
    }

    @Override
    public void send(String message) {
        System.out.println("[SMS via " + carrier + "] " + recipient + ": " + message);
    }
}