package basepatterns.creational.abstractfactory.banking;

import basepatterns.creational.abstractfactory.Developer;
import basepatterns.creational.abstractfactory.Manager;
import basepatterns.creational.abstractfactory.ProjectTeamFactory;
import basepatterns.creational.abstractfactory.Tester;

/**
 * Created by vladimir on 24.05.17.
 */
public class BankingTeamFactory implements ProjectTeamFactory {
    @Override
    public Developer getDeveloper() {
        return new JavaDeveloper();
    }

    @Override
    public Tester getTester() {
        return new QATester();
    }

    @Override
    public Manager getProjectManager() {
        return new BankingPM();
    }
}
