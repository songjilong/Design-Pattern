package code.decorator.coffeedemo;

/**
 * @author song
 * @create 2020/4/2 23:40
 */
public abstract class Coffee {
    public String des = "咖啡"; //描述
    private float price = 0.0f; //价格

    protected abstract float cost(); //计算费用

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}
