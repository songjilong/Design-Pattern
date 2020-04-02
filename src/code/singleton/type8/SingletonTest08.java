package code.singleton.type8;

/**
 * 设计模式之单例模式
 * 枚举
 *
 * @author song
 * @create 2020/3/4 16:41
 */
public class SingletonTest08 {
    public static void main(String[] args) {
        Singleton instance1 = Singleton.INSTANCE;
        Singleton instance2 = Singleton.INSTANCE;
        System.out.println("两次获取的实例一样吗：" + (instance1 == instance2)); //true
    }
}

enum Singleton{
    INSTANCE;
}
