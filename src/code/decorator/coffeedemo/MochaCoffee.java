package code.decorator.coffeedemo;

/**
 * @author song
 * @create 2020/4/2 23:41
 */
public class MochaCoffee extends Coffee {
    public MochaCoffee() {
        setDes("摩卡咖啡");
        setPrice(5.5f);
    }

    @Override
    protected float cost() {
        return getPrice();
    }
}

