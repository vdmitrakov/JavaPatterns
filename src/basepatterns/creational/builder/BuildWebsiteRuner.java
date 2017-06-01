package basepatterns.creational.builder;

/**
 * Created by vladimir on 25.05.17.
 */
public class BuildWebsiteRuner {
    public static void main(String[] args) {
        Director director = new Director();
        //director.setBuilder(new EnterpriseWebsiteBuilder() );
        director.setBuilder(new VisitCardWebsiteBuilder() );


        Website website = director.buildWebsite();
        System.out.println(website);
    }
}
