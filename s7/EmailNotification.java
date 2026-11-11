package s7;

import java.util.ArrayList;

public class EmailNotification extends Notification {
    private String subject;

    public EmailNotification(String recipient, String subject) {
        super(recipient);
        this.subject = subject;
    }

    @Override
    public String getChannelName() {
        
        return "Email";
    }

    @Override
    public void send(String message) {
        System.out.println("To " + recipient + " with subject: " + subject);
        System.out.println("Message: " + message);
    }
}
