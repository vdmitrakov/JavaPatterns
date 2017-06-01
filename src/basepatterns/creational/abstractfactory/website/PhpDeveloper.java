package basepatterns.creational.abstractfactory.website;

import basepatterns.creational.abstractfactory.Developer;

/**
 * Created by vladimir on 24.05.17.
 */
public class PhpDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("PHP developer writes PHP code...");
    }
}
