package code.decorator.coffeedemo;

/**
 * @author song
 * @create 2020/4/2 23:43
 */
public class Decorator extends Coffee {

    private Coffee coffee;

    public Decorator(Coffee drink) {
        this.coffee = drink;
    }

    @Override
    protected float cost() {
        return getPrice() + coffee.cost();
    }

    @Override
    public String getDes() {
        return coffee.getDes() + "加" + super.getDes();
    }
}
