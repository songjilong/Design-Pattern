package code.decorator.coffeedemo;

import org.junit.Test;

/**
 * @author song
 * @create 2020/4/2 23:50
 */
public class Client {
    /**
     * 点一杯 加两份糖一份牛奶的摩卡咖啡
     */
    @Test
    public void test01() {
        Coffee order = new MochaCoffee();
        System.out.println(order.getDes() + "，价格：" + order.cost());
        //加两份糖
        order = new SugarDecorator(new SugarDecorator(order));
        System.out.println(order.getDes() + "，价格：" + order.cost());
        //加一份牛奶
        order = new MilkDecorator(order);
        System.out.println(order.getDes() + "，价格：" + order.cost());
    }
}
