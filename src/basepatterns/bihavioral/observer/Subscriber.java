package basepatterns.bihavioral.observer;

import java.util.List;

/**
 * Created by vladimir on 30.05.17.
 */
public class Subscriber implements Observer {
    String name;

    public Subscriber(String name) {
        this.name = name;
    }

    @Override
    public void HandleEvent(List<String> vacancies) {
        System.out.println("Dear " + name + "\nWe have some changes in vacancies:\n" + vacancies);
        System.out.println("================================================================\n");
    }
}
