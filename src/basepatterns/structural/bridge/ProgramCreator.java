package basepatterns.structural.bridge;

/**
 * Created by vladimir on 26.05.17.
 */
public class ProgramCreator {
    public static void main(String[] args) {
        Program [] programs = {
                new BankSystem(new CppDeveloper()),
                new StockExchange(new JavaDeveloper()),
                new BankSystem(new JavaDeveloper())
        };

        for (Program program: programs) {
            program.developerProgram();
            System.out.println("================================\n");

        }
    }
}
