package basepatterns.structural.flyweight;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by vladimir on 26.05.17.
 */
public class ProjectRunner {
    public static void main(String[] args) {
        DeveloperFactory developerFactory = new DeveloperFactory();
        List<Developer> developers = new ArrayList<>();

        developers.add(developerFactory.getDeveloperBySpesialty("java"));
        developers.add(developerFactory.getDeveloperBySpesialty("java"));
        developers.add(developerFactory.getDeveloperBySpesialty("java"));
        developers.add(developerFactory.getDeveloperBySpesialty("java"));
        developers.add(developerFactory.getDeveloperBySpesialty("java"));
        
        developers.add(developerFactory.getDeveloperBySpesialty("c++"));
        developers.add(developerFactory.getDeveloperBySpesialty("c++"));
        developers.add(developerFactory.getDeveloperBySpesialty("c++"));
        developers.add(developerFactory.getDeveloperBySpesialty("c++"));
        developers.add(developerFactory.getDeveloperBySpesialty("c++"));

        for (Developer developer : developers) {
            developer.writeCode();
        }

    }
}
