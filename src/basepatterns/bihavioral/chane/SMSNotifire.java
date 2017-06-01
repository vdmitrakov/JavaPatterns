package basepatterns.bihavioral.chane;

/**
 * Created by vladimir on 29.05.17.
 */
public class SMSNotifire extends Notifier {
    public SMSNotifire(int priority) {
        super(priority);
    }

    @Override
    public void write(String message) {
        System.out.println("Sending SMS to manager: " + message);
    }
}
