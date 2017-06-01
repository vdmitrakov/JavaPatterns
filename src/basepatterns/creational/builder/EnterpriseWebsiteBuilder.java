package basepatterns.creational.builder;

/**
 * Created by vladimir on 25.05.17.
 */
public class EnterpriseWebsiteBuilder extends WebsiteBuilder{

    @Override
    void BuildName() {
        website.setName("Enterprise");
    }

    @Override
    void BuildCms() {
        website.setCms(Cms.ALFRESCO);
    }

    @Override
    void BuildPrice() {
        website.setPrice(10000);
    }

}