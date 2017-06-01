package basepatterns.bihavioral.observer;

/**
 * Created by vladimir on 30.05.17.
 */
public class JobSearch {
    public static void main(String[] args) {
        JavaDeveloperJobSite jobSite = new JavaDeveloperJobSite();

        jobSite.addVacancy("First Java Developer position");
        jobSite.addVacancy("Second Java Developer position");

        Observer firstSubscriber = new Subscriber("Evgen Suleymanov");
        Observer secondSubscriber = new Subscriber("Peter Romanenko");

        jobSite.addOrserver(firstSubscriber);
        jobSite.addOrserver(secondSubscriber);

        jobSite.addVacancy("Third Java Developer position");

        jobSite.removeVacancy("Second Java Developer position");

    }
}
