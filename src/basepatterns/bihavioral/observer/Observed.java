package basepatterns.bihavioral.observer;

/**
 * Created by vladimir on 30.05.17.
 */
public interface Observed {

    public void addOrserver(Observer observer);
    public void removeOrserver(Observer observer);
    public void notifyOrservers();

}
