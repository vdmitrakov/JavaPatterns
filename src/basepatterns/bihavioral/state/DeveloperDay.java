package basepatterns.bihavioral.state;

/**
 * Created by vladimir on 30.05.17.
 */
public class DeveloperDay {
    public static void main(String[] args) {
        Activity activity = new Sleeping();
        Developer developer = new Developer();

        developer.setActivity(activity);
        System.out.println("Start of the Developer Day.");
        System.out.println("=============================================");
        for (int i = 0; i < 9; i++) {
            developer.justDoIt();
            developer.changeActivity();

        }
        System.out.println("=============================================");
        System.out.println("End of the Developer Day.");
    }
}
