package com.design.factory.abs;

/**
 * @author song
 * @create 2020/3/20 11:08
 */
public class M16Factory implements ArmsFactory{

    @Override
    public Gun produceGun() {
        return new M16();
    }

    @Override
    public Bullet produceBullet() {
        return new M16Bullet();
    }
}
