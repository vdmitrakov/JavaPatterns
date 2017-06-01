package basepatterns.structural.proxy;

/**
 * Created by vladimir on 26.05.17.
 */
public class ProjectRunner {
    public static void main(String[] args) {
        Project project = new ProxyProject("https://www.github.com/proseliter/realProject");

        project.run();
    }
}
