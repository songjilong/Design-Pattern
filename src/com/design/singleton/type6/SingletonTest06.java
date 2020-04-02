package com.design.singleton.type6;

/**
 * 设计模式之单例模式
 * 双重检查
 *
 * @author song
 * @create 2020/3/4 15:08
 */
public class SingletonTest06 {
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
    private static volatile Singleton instance;

    //双重判断 + 同步锁
    public static Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }

}
