package code.strategy;

/**
 * @author songjilong
 * @date 2020/5/16 22:23
 */
public class NotFlyBehavior implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("不会飞");
    }
}
