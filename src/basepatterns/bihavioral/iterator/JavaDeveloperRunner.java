package basepatterns.bihavioral.iterator;

/**
 * Created by vladimir on 29.05.17.
 */
public class JavaDeveloperRunner {
    public static void main(String[] args) {
        String[] skills = {"Java", "Spring", "Hibernate", "Maven", "PostgreeSQL"};

        JavaDeveloper javaDeveloper = new JavaDeveloper("Eugen Suleymanov", skills);

        Iterator iterator =  javaDeveloper.getIterator();

        System.out.println("Developer: " + javaDeveloper.getName());
        System.out.println("Skills: ");


        while (iterator.hasNext()){

            System.out.print(iterator.next().toString() + " ");
        }
    }
}
