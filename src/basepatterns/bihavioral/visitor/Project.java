package basepatterns.bihavioral.visitor;

/**
 * Created by vladimir on 31.05.17.
 */
public class Project implements ProjectElement {
    ProjectElement[] projectElements;

    public Project(){
        this.projectElements = new ProjectElement[]
        {
            new ProjectClass(),
            new Database(),
            new Test()
        };
    }

    @Override
    public void beWritten(Developer developer) {
        for (ProjectElement projectElement : projectElements) {
            projectElement.beWritten(developer);
        }
    }
}
