package com.design.decorator.shapedemo;

/**
 * @author song
 * @create 2020/4/2 23:03
 */
public class Square implements Shape {
    @Override
    public void draw() {
        System.out.print("正方形");
    }
}
