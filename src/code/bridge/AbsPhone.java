package code.bridge;

/**
 * @author song
 * @create 2020/3/30 15:57
 */
public abstract class AbsPhone{

    private PhoneBrand brand;

    public AbsPhone(PhoneBrand brand) {
        this.brand = brand;
    }

    protected void open(){
        brand.open();
    }

    protected void close(){
        brand.close();
    }
}
