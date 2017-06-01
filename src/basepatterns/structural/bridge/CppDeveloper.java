package basepatterns.structural.bridge;

/**
 * Created by vladimir on 26.05.17.
 */
public class CppDeveloper implements Developer{
    @Override
    public void writeCode() {
        System.out.println("C++ developer writes C++ code");
    }
}
