package code.proxy.staticproxy;

import org.junit.Test;

/**
 * @author songjilong
 * @date 2020/4/15 17:44
 */
public class Client {
    @Test
    public void test(){
        IProducer producer = new Producer();
        ProxyProducer proxyProducer = new ProxyProducer(producer);
        proxyProducer.sale(1000f);
    }
}
