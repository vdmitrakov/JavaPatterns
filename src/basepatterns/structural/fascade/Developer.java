package basepatterns.structural.fascade;

/**
 * Created by vladimir on 26.05.17.
 */
public class Developer {
    public void doJobBeforeDeadline(BugTracker bugTracker){
        if(bugTracker.isActivSprint()){
            System.out.println("Developer is solving problem...");
        }else {
            System.out.println("Developer is read Habrahabr...");
        }

    }
}
