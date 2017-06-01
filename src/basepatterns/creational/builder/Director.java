package basepatterns.creational.builder;

/**
 * Created by vladimir on 25.05.17.
 */
public class Director {
    WebsiteBuilder builder;

    public void setBuilder(WebsiteBuilder builder) {
        this.builder = builder;
    }

    Website buildWebsite(){
        builder.CreateWebsite();
        builder.BuildName();
        builder.BuildCms();
        builder.BuildPrice();

        Website website = builder.getWebsite();

        return website;
    }
}
