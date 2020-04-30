package code.iterator;

import org.junit.Test;

/**
 * @author songjilong
 * @date 2020/4/29 23:21
 */
public class Client {
    @Test
    public void test() {
        Aggregate<String> aggregate = new ConcreteAggregate<>();
        aggregate.add("张三");
        aggregate.add("李四");
        aggregate.add("王五");
        Iterator<String> iterator = aggregate.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
