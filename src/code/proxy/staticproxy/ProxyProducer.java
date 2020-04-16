package code.proxy.staticproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author songjilong
 * @date 2020/4/16 13:39
 */
public class ProxyProducer implements IProducer{

    private IProducer producer;

    public ProxyProducer(IProducer producer) {
        this.producer = producer;
    }

    @Override
    public void sale(float money) {
        producer.sale(money * 0.8f);
    }
}
