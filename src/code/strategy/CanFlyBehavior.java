package code.strategy;

/**
 * @author songjilong
 * @date 2020/5/16 22:23
 */
public class CanFlyBehavior implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("可以飞");
    }
}
