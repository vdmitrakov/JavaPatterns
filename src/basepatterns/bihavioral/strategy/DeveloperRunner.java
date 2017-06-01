package basepatterns.bihavioral.strategy;

/**
 * Created by vladimir on 31.05.17.
 */
public class DeveloperRunner {
    public static void main(String[] args) {
        Developer developer = new Developer();

        developer.setActivity(new Sleeping());
        developer.executeActivity();

        developer.setActivity(new Training());
        developer.executeActivity();

        developer.setActivity(new Codding());
        developer.executeActivity();

        developer.setActivity(new Reading());
        developer.executeActivity();

        developer.setActivity(new Sleeping());
        developer.executeActivity();
    }
}
