package basepatterns.structural.fascade;

/**
 * Created by vladimir on 26.05.17.
 */
public class BugTracker {
    public boolean activeSprint;

    public boolean isActivSprint(){
        return activeSprint;
    }

    public void startSprint(){
        System.out.println("Sprint is active.");
        activeSprint = true;
    }

    public void finishSprint(){
        System.out.println("Sprint is not active.");
        activeSprint = false;
    }
}
