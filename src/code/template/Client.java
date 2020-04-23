package code.template;

import org.junit.Test;

/**
 * @author songjilong
 * @date 2020/4/23 15:17
 */
public class Client {
    @Test
    public void test() {
        BaseSoyMilk peanutSoyMilk = new PeanutSoyMilk();
        peanutSoyMilk.make();
        System.out.println("****************");
        BaseSoyMilk redBeanSoyMilk = new RedBeanSoyMilk();
        redBeanSoyMilk.make();
    }
    @Test
    public void test2() {
        BaseSoyMilk pureSoyMilk = new PureSoyMilk();
        pureSoyMilk.make();
    }
}
