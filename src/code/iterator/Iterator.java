package code.iterator;

/**
 * @author songjilong
 * @date 2020/4/29 23:11
 * 抽象迭代器
 */
public interface Iterator<T> {
    boolean hasNext();

    T next();
}
