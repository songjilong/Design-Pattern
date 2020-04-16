package code.proxy.dynamicproxy;

/**
 * @author songjilong
 * @date 2020/4/16 13:38
 */
public class Producer implements IProducer {
    @Override
    public void sale(float money) {
        System.out.println("卖出产品，厂家获得" + money + "元");
    }
}
