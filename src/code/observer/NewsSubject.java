package code.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author songjilong
 * @date 2020/5/3 21:28
 */
public class NewsSubject implements Subject {
    private List<Observer> observers = new ArrayList<>();

    @Override
    public void attach(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void detach(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notify(String message) {
        for (Observer observer : observers) {
            observer.update(message);
        }
    }
}
