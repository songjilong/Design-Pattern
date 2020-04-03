package code.decorator.coffeedemo;

/**
 * @author song
 * @create 2020/4/2 23:47
 */
public class MilkDecorator extends Decorator {
    public MilkDecorator(Coffee coffee) {
        super(coffee);
        setDes("牛奶");
        setPrice(2.0f);
    }
}
