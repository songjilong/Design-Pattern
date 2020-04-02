package code.decorator.coffeedemo;

/**
 * @author song
 * @create 2020/4/2 23:43
 */
public class Decorator extends Drink {

    private Drink drink;

    public Decorator(Drink drink) {
        this.drink = drink;
    }

    @Override
    protected float cost() {
        return super.getPrice() + drink.cost();
    }

    @Override
    public String getDes() {
        return drink.getDes() + " 加 " + super.getDes();
    }
}
