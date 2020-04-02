package code.decorator.coffeedemo;

/**
 * @author song
 * @create 2020/4/2 23:40
 */
public class Coffee extends Drink {
    @Override
    protected float cost() {
        return super.getPrice();
    }
}
