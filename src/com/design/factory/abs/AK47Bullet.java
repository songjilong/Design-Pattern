package com.design.factory.abs;

/**
 * @author song
 * @create 2020/3/20 11:05
 */
public class AK47Bullet implements Bullet {
    @Override
    public void loading() {
        System.out.println("AK47装子弹");
    }
}
