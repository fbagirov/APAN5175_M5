package s7;


public abstract class Notification {
    protected String recipient;

    public Notification(String recipient) {
        // TODO
    }

    public abstract String getChannelName();

    public abstract void send(String message);
}
