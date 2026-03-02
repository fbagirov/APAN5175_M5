package s7;


import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Notification> list = new ArrayList<>();
        list.add(new EmailNotification("alice@example.com", "Welcome!"));
        list.add(new SMSNotification("+12025550123", "Verizon"));

        for (Notification n : list) {
            System.out.println("Channel: " + n.getChannelName());
            n.send("Hello from Week 6!"); // dynamic polymorphism
            System.out.println("----");
        }
    }
}