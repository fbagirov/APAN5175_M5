package s7;



public class SMSNotification extends Notification {
    private String carrier;

    public SMSNotification(String recipient, String carrier) {
        super(recipient);
        // TODO
    }

    @Override
    public String getChannelName() {
        // TODO
        return "TODO";
    }

    @Override
    public void send(String message) {
        // TODO print SMS format with carrier
    }
}