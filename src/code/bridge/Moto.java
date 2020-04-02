package code.bridge;

/**
 * @author song
 * @create 2020/3/30 15:58
 */
public class Moto implements PhoneBrand {
    @Override
    public void open() {
        System.out.println("摩托罗拉开机...");
    }

    @Override
    public void close() {
        System.out.println("摩托罗拉关机...");
    }
}
