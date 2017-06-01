package basepatterns.structural.fascade;

/**
 * Created by vladimir on 26.05.17.
 */
public class Workflow {
    Job job = new Job();
    Developer developer = new Developer();
    BugTracker bugTracker = new BugTracker();

    public void solveProblem(){
        job.doJob();
        bugTracker.startSprint();
        developer.doJobBeforeDeadline(bugTracker);

    }

    public void relax(){
        //job.doJob();
        bugTracker.finishSprint();
        developer.doJobBeforeDeadline(bugTracker);

    }
}
