package code.singleton.type3;

/**
 * 设计模式之单例模式
 * 懒汉式（线程不安全）
 *
 * @author song
 * @create 2020/3/4 15:08
 */
public class SingletonTest03 {
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

    //声明实例对象
    private static Singleton instance;

    //通过此方法获取实例
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

}
