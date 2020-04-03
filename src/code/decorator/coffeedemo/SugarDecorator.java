package code.decorator.coffeedemo;

/**
 * @author song
 * @create 2020/4/2 23:47
 */
public class SugarDecorator extends Decorator {
    public SugarDecorator(Coffee coffee) {
        super(coffee);
        setDes("糖");
        setPrice(1.0f);
    }
}
