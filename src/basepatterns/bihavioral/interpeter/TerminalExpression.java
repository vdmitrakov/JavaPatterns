package basepatterns.bihavioral.interpeter;

/**
 * Created by vladimir on 29.05.17.
 */
public class TerminalExpression implements Expression {
    String data;

    public TerminalExpression(String data) {
        this.data = data;
    }

    @Override
    public boolean interpret(String context) {
        if (context.contains(data)){
        return true;
        }
        return false;
    }
}
