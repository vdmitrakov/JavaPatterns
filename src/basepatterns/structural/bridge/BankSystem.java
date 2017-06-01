package basepatterns.structural.bridge;

/**
 * Created by vladimir on 26.05.17.
 */
public class BankSystem extends Program {

    protected BankSystem(Developer developer) {
        super(developer);
    }

    @Override
    public void developerProgram() {
        System.out.println("Bank system development in progress...");
        developer.writeCode();
    }
}
