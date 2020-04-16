package code.proxy.cglibproxy;

import org.junit.Test;

/**
 * @author songjilong
 * @date 2020/4/16 15:56
 */
public class Client {
    @Test
    public void test() {
        Producer producer = new Producer();
        Producer proxyInstance = (Producer) new ProxyProducer(producer).getProxyInstance();
        proxyInstance.sale(1000f);
    }
}
