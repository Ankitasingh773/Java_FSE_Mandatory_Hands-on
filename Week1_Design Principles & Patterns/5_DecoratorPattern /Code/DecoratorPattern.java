public interface Notifier {
    void send(String message);
}
public class EmailNotifier implements Notifier{
    @Override
    public void send(String message) {
        System.out.println("Sending Email: " + message);
    }
}
public abstract class NotifierDecorator implements Notifier{
    protected Notifier notifier;

    public NotifierDecorator(Notifier notifier) {
        this.notifier = notifier;
    }

    public void send(String message) {
        notifier.send(message);
    }
}
public class SMSNotifierDecorator extends NotifierDecorator{
    public SMSNotifierDecorator(Notifier notifier) {
        super(notifier);
    }

    @Override
    public void send(String message) {
        super.send(message);
        System.out.println("Sending SMS: " + message);
    }

}
public class SlackNotifierDecorator extends NotifierDecorator{
    public SlackNotifierDecorator(Notifier notifier) {
        super(notifier);
    }

    @Override
    public void send(String message) {
        super.send(message);
        System.out.println("Sending Slack: " + message);
    }
}
public class Main {
    public static void main(String[] args) {
        Notifier emailNoti = new EmailNotifier();

        Notifier smsNoti = new SMSNotifierDecorator(emailNotifier);
        Notifier slackAndSmsNoti = new SlackNotifierDecorator(smsNotifier);

        System.out.println("====== Sending with all channels ======");
        slackAndSmsNoti.send("You have a new notification.");
    }
}


