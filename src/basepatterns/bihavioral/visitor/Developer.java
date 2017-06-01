package basepatterns.bihavioral.visitor;

/**
 * Created by vladimir on 31.05.17.
 */
public interface Developer {

    public void create (ProjectClass projectClass);
    public void create (Database database);
    public void create (Test test);
}
