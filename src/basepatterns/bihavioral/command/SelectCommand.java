package basepatterns.bihavioral.command;

/**
 * Created by vladimir on 29.05.17.
 */
public class SelectCommand implements Command {
    Database database;

    public SelectCommand(Database database) {
        this.database = database;
    }

    @Override
    public void execute() {
        database.select();
    }
}
