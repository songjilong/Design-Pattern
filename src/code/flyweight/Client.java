package code.flyweight;

import org.junit.Test;

/**
 * @author songjilong
 * @date 2020/4/14 13:38
 */
public class Client {
    @Test
    public void test(){
        WebsiteFactory factory = new WebsiteFactory();

        AbstractWebsite website1 = factory.getWebsite("新闻");
        website1.publish(new User("张三"));
        website1.publish(new User("李四"));

        AbstractWebsite website2 = factory.getWebsite("博客");
        website2.publish(new User("王五"));
        website2.publish(new User("赵六"));

        AbstractWebsite website3 = factory.getWebsite("公众号");
        website3.publish(new User("陈七"));
        website3.publish(new User("胡八"));

        System.out.println("对象的个数：" + factory.count());
    }
}
