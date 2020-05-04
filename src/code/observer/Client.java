package code.observer;

import org.junit.Test;

/**
 * @author songjilong
 * @date 2020/5/3 21:48
 */
public class Client {
    @Test
    public void test() {
        Subject newsSubject = new NewsSubject();
        Observer user1 = new UserObserver("小龙");
        Observer user2 = new UserObserver("小凤");
        newsSubject.attach(user1);
        newsSubject.attach(user2);
        newsSubject.notify("新闻频道发布了一条紧急新闻");
    }
}
