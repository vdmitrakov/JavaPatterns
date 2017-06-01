package basepatterns.bihavioral.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by vladimir on 30.05.17.
 */
public class JavaDeveloperJobSite implements Observed {

    List<String> vacancies = new ArrayList<>();
    List<Observer> subscribers = new ArrayList<>();

    public void addVacancy(String vacancy){
        this.vacancies.add(vacancy);
        notifyOrservers();
    }

    public void removeVacancy(String vacancy){
        this.vacancies.remove(vacancy);
        notifyOrservers();
    }



    @Override
    public void addOrserver(Observer observer) {
        this.subscribers.add(observer);
    }

    @Override
    public void removeOrserver(Observer observer) {
        this.subscribers.remove(observer);
    }

    @Override
    public void notifyOrservers() {
        for (Observer observer : subscribers) {
            observer.HandleEvent(this.vacancies);
        }
    }
}
