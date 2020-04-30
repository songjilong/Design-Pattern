package code.iterator;

import java.util.List;

/**
 * @author songjilong
 * @date 2020/4/29 23:14
 * 具体迭代器
 */
public class ConcreteIterator<T> implements Iterator<T> {
    private List<T> list;
    private int index = -1;

    public ConcreteIterator(List<T> list) {
        this.list = list;
    }

    @Override
    public boolean hasNext() {
        return index < list.size() - 1;
    }

    @Override
    public T next() {
        T t = null;
        if (this.hasNext()) {
            t = list.get(++index);
        }
        return t;
    }
}
