package code.bridge;

/**
 * @author song
 * @create 2020/3/30 16:04
 */
public class FoldingPhone extends AbsPhone{

    public FoldingPhone(PhoneBrand brand) {
        super(brand);
    }

    @Override
    protected void open() {
        System.out.print("折叠式 - ");
        super.open();
    }

    @Override
    protected void close() {
        System.out.print("折叠式 - ");
        super.close();
    }
}
