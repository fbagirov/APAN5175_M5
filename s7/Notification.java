package s7;


public abstract class Notification {
    protected String recipient;

    public Notification(String recipient) {
        this.recipient = recipient;
    }

    public abstract String getChannelName();

    public abstract void send(String message);

    @Override
    public String toString() {
        return getChannelName() + " Notification to " + recipient;
    }
}
