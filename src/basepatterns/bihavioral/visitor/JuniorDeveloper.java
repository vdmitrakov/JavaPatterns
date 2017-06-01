package basepatterns.bihavioral.visitor;

/**
 * Created by vladimir on 31.05.17.
 */
public class JuniorDeveloper implements Developer {
    @Override
    public void create(ProjectClass projectClass) {
        System.out.println("Written poor class...");
    }

    @Override
    public void create(Database database) {
        System.out.println("Drop database...");
    }

    @Override
    public void create(Test test) {
        System.out.println("Create no relible test...");
    }
}
