package basepatterns.creational.abstractfactory.banking;

import basepatterns.creational.abstractfactory.Developer;

/**
 * Created by vladimir on 24.05.17.
 */
public class JavaDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("Java developer writes Java code...");
    }
}
