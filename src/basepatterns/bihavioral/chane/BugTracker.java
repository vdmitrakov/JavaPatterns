package basepatterns.bihavioral.chane;

/**
 * Created by vladimir on 29.05.17.
 */
public class BugTracker {
    public static void main(String[] args) {
        Notifier reportNotifier = new SimpleReportNotifire(Priority.ROUTINE);
        Notifier emailNotifier = new EmailNotifire(Priority.IMPOTANT);
        Notifier smsNotifire = new SMSNotifire(Priority.ASAP);

        reportNotifier.setNextNotifier(emailNotifier);
        emailNotifier.setNextNotifier(smsNotifire);

        reportNotifier.notifyManager("Everything is OK.", Priority.ROUTINE);
        reportNotifier.notifyManager("Something went wrong!", Priority.IMPOTANT);
        reportNotifier.notifyManager("Heuston, we've had a problem here!!!", Priority.ASAP);

    }
}
