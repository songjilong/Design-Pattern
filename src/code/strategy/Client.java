package code.strategy;

import org.junit.Test;

/**
 * @author songjilong
 * @date 2020/5/16 22:29
 */
public class Client {
    @Test
    public void test(){
        Duck duck1 = new WildDuck(new CanFlyBehavior());
        duck1.description();
        duck1.fly();
        Duck duck2 = new DomesticDuck(new NotFlyBehavior());
        duck2.description();
        duck2.fly();
    }
}
