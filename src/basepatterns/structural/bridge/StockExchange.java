package basepatterns.structural.bridge;

/**
 * Created by vladimir on 26.05.17.
 */
public class StockExchange extends Program{
    protected StockExchange(Developer developer) {
        super(developer);
    }

    @Override
    public void developerProgram() {
        System.out.println("Stock exchange in progress");
        developer.writeCode();
    }
}
