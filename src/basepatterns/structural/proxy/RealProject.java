package basepatterns.structural.proxy;

/**
 * Created by vladimir on 26.05.17.
 */
public class RealProject implements Project {

    public String url;

    public RealProject(String url) {
         this.url = url;
         load();
    }

    public void load(){
        System.out.println("Loading project from " + url + "...");
    }


    @Override
    public void run() {
        System.out.println("Running porject from " + url + "...");
    }
}
