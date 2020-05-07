package code.memento;

/**
 * @author songjilong
 * @date 2020/5/7 23:15
 */
public class Caretaker {
    private Memento memento;

    public Memento getMemento() {
        return memento;
    }

    public void setMemento(Memento memento) {
        this.memento = memento;
    }
}
