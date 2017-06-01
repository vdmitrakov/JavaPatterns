package basepatterns.creational.abstractfactory.website;

import basepatterns.creational.abstractfactory.Developer;
import basepatterns.creational.abstractfactory.Manager;
import basepatterns.creational.abstractfactory.ProjectTeamFactory;
import basepatterns.creational.abstractfactory.Tester;

/**
 * Created by vladimir on 24.05.17.
 */
public class WebsiteTeamFactory implements ProjectTeamFactory {
    @Override
    public Developer getDeveloper() {
        return new PhpDeveloper();
    }

    @Override
    public Tester getTester() {
        return new ManualTester();
    }

    @Override
    public Manager getProjectManager() {
        return new WebsitePM();
    }
}
