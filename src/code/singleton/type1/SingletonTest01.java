package code.singleton.type1;

/**
 * 设计模式之单例模式
 * 饿汉式（静态常量）
 *
 * @author song
 * @create 2020/3/4 15:08
 */
public class SingletonTest01 {
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

    //定义为常量，保证实例对象不变
    private final static Singleton instance = new Singleton();


    //通过此方法获取实例
    public static Singleton getInstance() {
        return instance;
    }

}
