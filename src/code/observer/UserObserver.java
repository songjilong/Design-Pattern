package code.observer;

/**
 * @author songjilong
 * @date 2020/5/3 21:45
 */
public class UserObserver implements Observer {
    private String name;

    public UserObserver(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        System.out.println(name + "收到通知：" + message);
    }
}
