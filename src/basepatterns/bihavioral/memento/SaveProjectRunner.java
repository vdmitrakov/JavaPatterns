package basepatterns.bihavioral.memento;

/**
 * Created by vladimir on 30.05.17.
 */
public class SaveProjectRunner {
    public static void main(String[] args) throws InterruptedException {
        Project project = new Project();
        GithubRepo githubRepo = new GithubRepo();

        System.out.println("Creating new project. Version 1.0");
        project.setVersionAndDate("Version 1.0");

        System.out.println(project);

        System.out.println("Saving current version to GitHib");
        githubRepo.setSave(project.save());

        System.out.println("Updating project to version 1.1...");
        System.out.println("writing poor code...");

        Thread.sleep(5000);

        project.setVersionAndDate("Version 1.1");
        System.out.println(project);
        System.out.println("Somting went wrong...");

        System.out.println("Rolling back to Version 1.0");
        project.load(githubRepo.getSave());

        System.out.println("Project after rollback: ");
        System.out.println(project);

    }
}
