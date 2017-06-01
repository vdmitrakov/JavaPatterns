package basepatterns.structural.adapter;

/**
 * Created by vladimir on 25.05.17.
 */
public class DatabaseRunner {
    public static void main(String[] args) {
        Database database = new AdapterJavaToDatabase();

        database.insert();
        database.update();
        database.select();
        database.remove();


    }
}
