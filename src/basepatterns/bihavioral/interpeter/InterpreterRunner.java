package basepatterns.bihavioral.interpeter;

/**
 * Created by vladimir on 29.05.17.
 */
public class InterpreterRunner {
    public static void main(String[] args) {
        Expression isJava = getJavaExpession();
        Expression isJavaEEDeveloper = getJavaEExpression();

        System.out.println("Does developer knowes Java core: " + isJava.interpret("Java Core"));
        System.out.println("Does developer knowes Java EE: " + isJavaEEDeveloper.interpret("Java Springu"));

    }



    private static Expression getJavaExpession() {
        Expression java = new TerminalExpression("Java");
        Expression javaCore = new TerminalExpression("Java Core");

        return new OrExpression(java,javaCore);

    }

    private static Expression getJavaEExpression() {
        Expression java = new TerminalExpression("Java");
        Expression spring = new TerminalExpression("Spring");
        return new AndExpression(java,spring);
    }


}





