package com.design.factory.abs;

/**
 * @author song
 * @create 2020/3/20 11:04
 */
public class AK47 implements Gun {
    @Override
    public void shooting() {
        System.out.println("AK47射击");
    }
}
