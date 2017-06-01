package basepatterns.structural.adapter;

/**
 * Created by vladimir on 25.05.17.
 */
public class AdapterJavaToDatabase extends JavaApplication implements Database {
    @Override
    public void insert() {
        insertObject();
    }

    @Override
    public void select() {
        selectObject();
    }

    @Override
    public void update() {
        updateObject();
    }

    @Override
    public void remove() {
        removeObject();
    }
}
