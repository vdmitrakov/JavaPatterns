package basepatterns.structural.proxy;

/**
 * Created by vladimir on 26.05.17.
 */
public class ProxyProject implements Project {
    private String url;
    private RealProject realProject;

    public ProxyProject(String url) {
        this.url = url;
    }

    @Override
    public void run() {
        if(realProject == null){
            realProject = new RealProject(url);
        }
        realProject.run();
    }
}
