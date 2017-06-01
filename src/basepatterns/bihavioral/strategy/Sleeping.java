package basepatterns.bihavioral.strategy;

/**
 * Created by vladimir on 30.05.17.
 */
public class Sleeping implements Activity {
    @Override
    public void justDoIt() {
        System.out.println("Sleeping...");
    }
}
