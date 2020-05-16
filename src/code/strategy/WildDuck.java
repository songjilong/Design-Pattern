package code.strategy;

/**
 * @author songjilong
 * @date 2020/5/16 22:20
 */
public class WildDuck extends Duck {

    public WildDuck(FlyBehavior flyBehavior) {
        super(flyBehavior);
    }

    @Override
    public void description() {
        System.out.println("我是野生鸭子");
    }
}
