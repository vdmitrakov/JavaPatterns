package basepatterns.bihavioral.command;

/**
 * Created by vladimir on 29.05.17.
 */
public class DeleteCommand implements Command {
    Database database;

    public DeleteCommand(Database database) {
        this.database = database;
    }

    @Override
    public void execute() {
        database.delete();
    }
}
