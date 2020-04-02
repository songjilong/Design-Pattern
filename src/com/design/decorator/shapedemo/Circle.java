package com.design.decorator.shapedemo;

/**
 * @author song
 * @create 2020/4/2 23:03
 */
public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.print("圆形");
    }
}
