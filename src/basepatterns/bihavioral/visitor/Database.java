package basepatterns.bihavioral.visitor;

/**
 * Created by vladimir on 31.05.17.
 */
public class Database implements ProjectElement {
    @Override
    public void beWritten(Developer developer) {
        developer.create(this);
    }
}
