package basepatterns.structural.composite;

import java.util.ArrayList;
import java.util.List;
/**
 * Created by vladimir on 26.05.17.
 */
public class Team {
    private List<Developer> developers = new ArrayList<Developer>();

    public void addDeveloper(Developer developer){
        developers.add(developer);
    }

    public void removeDeveloper(Developer developer){
        developers.remove(developer);
    }

    public void createProject(){
        System.out.println("Team creates project...");
        System.out.println("====================\n");

        for (Developer developer : developers) {
            developer.writeCode();
        }
    }
}
