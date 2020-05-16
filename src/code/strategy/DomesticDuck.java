package code.strategy;

/**
 * @author songjilong
 * @date 2020/5/16 22:21
 */
public class DomesticDuck extends Duck {

    public DomesticDuck(FlyBehavior flyBehavior) {
        super(flyBehavior);
    }

    @Override
    public void description() {
        System.out.println("我是家养鸭子");
    }
}
