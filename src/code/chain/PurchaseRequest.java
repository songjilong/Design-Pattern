package code.chain;

/**
 * @author songjilong
 * @date 2020/5/19 13:58
 */
public class PurchaseRequest {
    private int id;
    private float price;

    public PurchaseRequest(int id, float price) {
        this.id = id;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public float getPrice() {
        return price;
    }
}
