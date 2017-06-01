package basepatterns.creational.abstractfactory.website;

import basepatterns.creational.abstractfactory.Tester;

/**
 * Created by vladimir on 24.05.17.
 */
public class ManualTester implements Tester {
    @Override
    public void testCode() {
        System.out.println("Manual tester tests website...");
    }
}
