package code.strategy;

/**
 * @author songjilong
 * @date 2020/5/16 22:18
 */
public abstract class Duck {

    private FlyBehavior flyBehavior;

    public Duck(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void fly(){
        flyBehavior.fly();
    }

    public abstract void description();
}
