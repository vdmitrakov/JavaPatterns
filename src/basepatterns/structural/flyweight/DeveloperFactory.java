package basepatterns.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by vladimir on 26.05.17.
 */
public class DeveloperFactory {
    private static  final Map <String, Developer> developers = new HashMap<>();

    public Developer getDeveloperBySpesialty(String spesiality){
        Developer developer = developers.get(spesiality);

        if (developer == null){
            switch (spesiality){
                case "java":
                    System.out.println("Hiring java developer");
                    developer = new JavaDeveloper();
                    break;
                case "c++":
                    System.out.println("Hiring c++ developer");
                    developer = new CppDeveloper();

            }
            developers.put(spesiality, developer);

        }
        return developer;
    }
}
