package code.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * @author songjilong
 * @date 2020/4/29 23:20
 * 具体容器
 */
public class ConcreteAggregate<T> implements Aggregate<T> {
    private List<T> list = new ArrayList<>();

    @Override
    public void add(T obj) {
        list.add(obj);
    }

    @Override
    public void remove(T obj) {
        list.remove(obj);
    }

    @Override
    public Iterator<T> iterator() {
        return new ConcreteIterator<>(list);
    }
}
