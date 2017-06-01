package basepatterns.bihavioral.chane;

/**
 * Created by vladimir on 29.05.17.
 */
public class EmailNotifire extends Notifier {
    public EmailNotifire(int priority) {
        super(priority);
    }

    @Override
    public void write(String message) {
        System.out.println("Sending e-mail to manager: " + message);
    }
}
