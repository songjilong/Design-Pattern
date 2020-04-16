package code.proxy.cglibproxy;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @author songjilong
 * @date 2020/4/16 13:39
 */
public class ProxyProducer implements MethodInterceptor {
    /**
     * 维护一个目标对象
     */
    private Object target;

    public ProxyProducer(Object target) {
        this.target = target;
    }

    /**
     * 为目标对象生成代理对象
     */
    public Object getProxyInstance(){
        //创建一个工具类
        Enhancer enhancer = new Enhancer();
        //设置父类
        enhancer.setSuperclass(target.getClass());
        //设置回调函数
        enhancer.setCallback(this);
        //创建子类对象（代理对象）
        return enhancer.create();
    }

    /**
     * 会拦截被代理对象的所有方法
     * @param obj 增强对象
     * @param method 被代理对象的方法
     * @param args 被代理对象方法的参数
     * @param methodProxy 代理对象
     */
    @Override
    public Object intercept(Object obj, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
        System.out.println("obj：" + obj.getClass());
        Object returnValue = null;
        float money = (float) args[0] * 0.8f;
        if("sale".equals(method.getName())){
            returnValue = method.invoke(target, money);
        }
        return returnValue;
    }
}
