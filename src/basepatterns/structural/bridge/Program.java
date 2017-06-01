package basepatterns.structural.bridge;

/**
 * Created by vladimir on 26.05.17.
 */
public abstract class Program {
    protected Developer developer;

    protected Program(Developer developer) {
        this.developer = developer;
    }

    public abstract void developerProgram();
}
