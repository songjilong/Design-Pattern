package code.singleton.type7;

/**
 * 设计模式之单例模式
 * 静态内部类
 *
 * @author song
 * @create 2020/3/4 15:08
 */
public class SingletonTest07 {
    public static void main(String[] args) {
        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        System.out.println("两次获取的实例一样吗：" + (instance1 == instance2)); //true
    }
}

class Singleton {

    //私有构造方法，使其不可在外部通过构造器实例化
    private Singleton() {

    }

    //静态内部类
    private static class SingletonInstance{
        private final static Singleton INSTANCE = new Singleton();
    }

    //获取实例
    public static Singleton getInstance() {
        return SingletonInstance.INSTANCE;
    }

}
