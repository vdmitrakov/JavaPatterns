package basepatterns.structural.bridge;

/**
 * Created by vladimir on 26.05.17.
 */
public class JavaDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("Java developer writes Java code");
    }
}
