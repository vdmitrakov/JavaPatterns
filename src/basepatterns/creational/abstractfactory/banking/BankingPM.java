package basepatterns.creational.abstractfactory.banking;

import basepatterns.creational.abstractfactory.Manager;

/**
 * Created by vladimir on 24.05.17.
 */
public class BankingPM implements Manager {
    @Override
    public void managePoject() {
        System.out.println("Banking PM managing banking project...");
    }
}
