package basepatterns.structural.decorator;

/**
 * Created by vladimir on 26.05.17.
 */
public class Task {
    public static void main(String[] args) {
        System.out.println("Java developer");
        Developer developer = new JavaDeveloper();
        System.out.println(developer.makeJob());
        System.out.println("===================================\n");

        System.out.println("Senior java developer");
        Developer seniordeveloper = new SeniorJavaDeveloper(new JavaDeveloper());
        System.out.println(seniordeveloper.makeJob());
        System.out.println("===================================\n");


        System.out.println("Java team lead");
        Developer teamlead = new JavaTeamLead(new SeniorJavaDeveloper(new JavaDeveloper()));
        System.out.println(teamlead.makeJob());
        System.out.println("===================================\n");


    }
}
