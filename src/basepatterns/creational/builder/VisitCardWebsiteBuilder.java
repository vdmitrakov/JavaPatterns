package basepatterns.creational.builder;

/**
 * Created by vladimir on 25.05.17.
 */
public class VisitCardWebsiteBuilder extends WebsiteBuilder{


    @Override
    void BuildName() {
        website.setName("Visit card");
    }

    @Override
    void BuildCms() {
        website.setCms(Cms.WORDPRESS);
    }

    @Override
    void BuildPrice() {
        website.setPrice(500);
    }


}
