package basepatterns.creational.abstractfactory.website;

import basepatterns.creational.abstractfactory.Manager;

/**
 * Created by vladimir on 24.05.17.
 */
public class WebsitePM implements Manager {
    @Override
    public void managePoject() {
        System.out.println("Website manager managing website");
    }
}
