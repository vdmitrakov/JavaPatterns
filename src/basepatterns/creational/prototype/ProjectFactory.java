package basepatterns.creational.prototype;

/**
 * Created by vladimir on 25.05.17.
 */
public class ProjectFactory {
    Project project;

    public ProjectFactory(Project project) {
        this.project = project;
    }

    public void setProject(Project project) {
        this.project = project;
    }

    Project cloneProject(){
        return (Project)project.copy();
    }
}
