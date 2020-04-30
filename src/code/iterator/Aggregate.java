package code.iterator;

/**
 * @author songjilong
 * @date 2020/4/29 23:18
 * 抽象容器
 */
public interface Aggregate<T> {
    void add(T t);

    void remove(T t);

    Iterator<T> iterator();
}
