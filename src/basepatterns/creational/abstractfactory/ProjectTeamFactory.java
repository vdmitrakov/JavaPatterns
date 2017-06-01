package basepatterns.creational.abstractfactory;

/**
 * Created by vladimir on 24.05.17.
 */
public interface ProjectTeamFactory {
    Developer getDeveloper();
    Tester getTester();
    Manager getProjectManager();
}
