package basepatterns.structural.decorator;

/**
 * Created by vladimir on 26.05.17.
 */
public class JavaDeveloper implements Developer{
    @Override
    public String makeJob() {
        return "Writes Java code.";
    }
}
