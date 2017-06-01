package basepatterns.bihavioral.template;

/**
 * Created by vladimir on 31.05.17.
 */
public class WebSiteRunner {
    public static void main(String[] args) {
        WebSiteTemplate welcomePage = new WelcomePage();
        WebSiteTemplate newsPage = new NewsPage();

        welcomePage.showPage();
        System.out.println("---------------------------------------------------------");
        newsPage.showPage();
    }
}
