package code.adapter.classandobjectadapter;

import org.junit.Test;

/**
 * @author song
 * @create 2020/3/27 17:57
 */
public class Client {

    @Test
    public void test01(){
        System.out.println("====类适配器模式====");
        Phone.charging(new VoltageAdapter());
    }

    @Test
    public void test02(){
        System.out.println("====对象适配器模式====");
        Phone.charging(new VoltageAdapter2(new Voltage220V()));
    }
}
