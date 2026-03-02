package s7;


public class EmailNotification extends Notification {
    private String subject;

    public EmailNotification(String recipient, String subject) {
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
        // TODO print email format with subject
    }
}