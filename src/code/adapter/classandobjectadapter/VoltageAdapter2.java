package code.adapter.classandobjectadapter;

/**
 * @author song
 * @create 2020/3/27 17:53
 */
public class VoltageAdapter2 implements Voltage5V {

    private Voltage220V voltage220V;

    public VoltageAdapter2(Voltage220V voltage220V){
        this.voltage220V = voltage220V;
    }

    @Override
    public int output5V() {
        int src = this.voltage220V.output220V();
        int dst = src / 44;
        System.out.println("转换为" + dst + "V");
        return dst;
    }
}
