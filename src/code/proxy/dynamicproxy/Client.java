package code.proxy.dynamicproxy;

import org.junit.Test;

/**
 * @author songjilong
 * @date 2020/4/16 13:47
 */
public class Client {
    @Test
    public void test() {
        IProducer target = new Producer();
        System.out.println("被代理对象的类型：" + target.getClass());
        IProducer proxyInstance = (IProducer) new ProxyProducer(target).getProxyInstance();
        System.out.println("代理对象的类型：" + proxyInstance.getClass());
        System.out.println("=======================");
        proxyInstance.sale(1000f);
    }

}
