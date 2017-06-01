package basepatterns.bihavioral.chane;

/**
 * Created by vladimir on 29.05.17.
 */
public class SimpleReportNotifire extends  Notifier{

    public SimpleReportNotifire(int priority) {
        super(priority);
    }

    @Override
    public void write(String message) {
        System.out.println("Notifire using simple report: " + message);
    }
}
