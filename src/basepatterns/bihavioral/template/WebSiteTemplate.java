package basepatterns.bihavioral.template;

/**
 * Created by vladimir on 31.05.17.
 */
public abstract class WebSiteTemplate {
   public void showPage(){
       System.out.println("Header");
       showPageContent();
       System.out.println("Footer");
   }

    protected abstract void showPageContent();

}
