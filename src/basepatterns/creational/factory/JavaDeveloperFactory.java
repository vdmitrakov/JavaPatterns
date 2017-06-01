package basepatterns.creational.factory;

/**
 * Created by vladimir on 23.05.17.
 */
public class JavaDeveloperFactory implements DeveloperFactory {
    @Override
    public Developer CreateDeveloper() {
        return new JavaDeveloper();
    }
}
