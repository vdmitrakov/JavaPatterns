package basepatterns.creational.prototype;

/**
 * Created by vladimir on 25.05.17.
 */
public class VersionControlRuner {
    public static void main(String[] args) {
        Project master = new Project(1,"SuperProject","SourceCode sourcecode = new SourceCode();");

        System.out.println(master);

        ProjectFactory factory = new ProjectFactory(master);
        Project masterClone = factory.cloneProject();
        System.out.println("\n=================================================\n");
        System.out.println(masterClone);

    }
}
