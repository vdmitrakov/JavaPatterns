package basepatterns.creational.abstractfactory;

import basepatterns.creational.abstractfactory.website.ManualTester;
import basepatterns.creational.abstractfactory.website.PhpDeveloper;
import basepatterns.creational.abstractfactory.website.WebsitePM;
import basepatterns.creational.abstractfactory.website.WebsiteTeamFactory;

/**
 * Created by vladimir on 24.05.17.
 */
public class AuctionProject {
    public static void main(String[] args) {
        ProjectTeamFactory projectTeamFactory = new WebsiteTeamFactory();

        Developer developer = new PhpDeveloper();
        Tester tester = new ManualTester();
        Manager manager = new WebsitePM();

        System.out.println("Creating auction website...");
        developer.writeCode();
        tester.testCode();
        manager.managePoject();


    }
}
