package code.observer;

/**
 * @author songjilong
 * @date 2020/5/3 21:30
 */
public interface Subject {
    void attach(Observer observer);

    void detach(Observer observer);

    void notify(String message);
}
