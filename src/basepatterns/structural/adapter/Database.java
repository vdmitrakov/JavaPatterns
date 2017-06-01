package basepatterns.structural.adapter;

/**
 * Created by vladimir on 25.05.17.
 */
public interface Database {
    public void insert();
    public void select();
    public void update();
    public void remove();
}
