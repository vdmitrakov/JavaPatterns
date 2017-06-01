package basepatterns.bihavioral.command;

/**
 * Created by vladimir on 29.05.17.
 */
public class UpdateCommand implements  Command{
    Database database;

    public UpdateCommand(Database database) {
        this.database = database;
    }

    @Override
    public void execute() {
        database.update();
    }
}
