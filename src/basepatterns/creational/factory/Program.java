package basepatterns.creational.factory;

/**
 * Created by vladimir on 23.05.17.
 */
public class Program {
    public static void main(String[] args) {
        DeveloperFactory developerFactory = createDeveloperBySpeciality("php");
        Developer developer = developerFactory.CreateDeveloper();

        developer.WriteCode();
    }
    static DeveloperFactory createDeveloperBySpeciality (String speciality){
        if (speciality.equalsIgnoreCase("java")){
            return new JavaDeveloperFactory();
        }
        else if (speciality.equalsIgnoreCase("c++")){
            return new CppDeveloperFactory();
        }
        else if (speciality.equalsIgnoreCase("php")){
            return new PhpDeveloperFactory();
        }
        else {
            throw new RuntimeException(speciality + " is unknown speciality");
        }
    }
}
