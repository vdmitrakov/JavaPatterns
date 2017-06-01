package basepatterns.creational.abstractfactory;

import basepatterns.creational.abstractfactory.banking.BankingPM;
import basepatterns.creational.abstractfactory.banking.BankingTeamFactory;
import basepatterns.creational.abstractfactory.banking.JavaDeveloper;
import basepatterns.creational.abstractfactory.banking.QATester;

/**
 * Created by vladimir on 24.05.17.
 */
public class SuperBankSystem {
    public static void main(String[] args) {
        ProjectTeamFactory projectTeamFactory = new BankingTeamFactory();

        Developer developer = new JavaDeveloper();
        Tester tester = new QATester();
        Manager manager = new BankingPM();

        System.out.println("Creating bank system...");
        developer.writeCode();
        tester.testCode();
        manager.managePoject();


    }
}
