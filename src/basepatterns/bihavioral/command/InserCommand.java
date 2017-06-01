package basepatterns.bihavioral.command;

/**
 * Created by vladimir on 29.05.17.
 */
public class InserCommand implements Command {
    Database database;

    public InserCommand(Database database) {
        this.database = database;
    }

    @Override
    public void execute() {
        database.insert();
    }
}
