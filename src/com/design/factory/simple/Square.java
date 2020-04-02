package com.design.factory.simple;

/**
 * @author song
 * @create 2020/3/20 10:06
 */
public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("正方形");
    }
}
