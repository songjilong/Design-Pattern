package code.memento;

/**
 * @author songjilong
 * @date 2020/5/7 23:15
 */
public class Originator {
    private String state;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Memento createMemento() {
        Memento memento = new Memento();
        memento.setState(state);
        return memento;
    }

    public void restoreMemento(Memento memento) {
        this.state = memento.getState();
    }
}
