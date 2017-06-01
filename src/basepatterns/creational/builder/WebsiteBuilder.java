package basepatterns.creational.builder;

/**
 * Created by vladimir on 25.05.17.
 */
public abstract class WebsiteBuilder {
    Website website;

    void CreateWebsite(){
        website = new Website();
    }

    abstract void BuildName();
    abstract void BuildCms();
    abstract void BuildPrice();

    Website getWebsite() {
        return website;
    }

}
