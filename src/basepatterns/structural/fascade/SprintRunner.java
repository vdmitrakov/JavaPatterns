package basepatterns.structural.fascade;

/**
 * Created by vladimir on 26.05.17.
 */
public class SprintRunner {
    public static void main(String[] args) {
        Workflow workflow = new Workflow();

        workflow.solveProblem();
        System.out.println("\nOne hour after");
        workflow.relax();
    }
}
