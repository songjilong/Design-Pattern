package code.proxy.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author songjilong
 * @date 2020/4/16 13:39
 */
public class ProxyProducer {
    /**
     * 维护一个目标对象
     */
    private Object target;

    public ProxyProducer(Object target) {
        this.target = target;
    }

    public Object getProxyInstance() {
        return Proxy.newProxyInstance(
                target.getClass().getClassLoader(),
                target.getClass().getInterfaces(),
                new InvocationHandler() {
                    /**
                     * 执行被代理对象的任何接口方法都会经过这里
                     * @param proxy 代理对象的引用
                     * @param method 当前执行的方法
                     * @param args 当前执行方法的参数
                     * @return 和被代理对象具有相同的返回值
                     * @throws Throwable
                     */
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        //代理过程中执行一些方法
                        float money = (float) args[0] * 0.8f;
                        //反射机制调用目标对象的方法
                        Object invoke = method.invoke(target, money);
                        return invoke;
                    }
                });
    }
}
