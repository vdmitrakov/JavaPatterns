package basepatterns.structural.composite;

/**
 * Created by vladimir on 26.05.17.
 */
public class Project {
    public static void main(String[] args) {
        Team team = new Team();

        Developer firstJavaDeveloper = new JavaDeveloper();
        Developer secondJavaDeveloper = new JavaDeveloper();

        Developer firstCppDeveloper = new CppDeveloper();


        team.addDeveloper(firstJavaDeveloper);
        team.addDeveloper(secondJavaDeveloper);

        team.addDeveloper(firstCppDeveloper);

        team.createProject();

    }
}
