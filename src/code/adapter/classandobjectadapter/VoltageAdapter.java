package code.adapter.classandobjectadapter;

/**
 * @author song
 * @create 2020/3/27 17:53
 */
public class VoltageAdapter extends Voltage220V implements Voltage5V {
    @Override
    public int output5V() {
        int src = super.output220V();
        int dst = src / 44;
        System.out.println("转换为" + dst + "V");
        return dst;
    }
}
