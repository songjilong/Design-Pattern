package com.design.decorator.shapedemo;

/**
 * @author song
 * @create 2020/4/2 23:07
 */
public class BlackDecorator extends Decorator {
    public BlackDecorator(Shape shape) {
        super(shape);
    }

    @Override
    public void draw() {
        shape.draw();
        setBlackBorder();
    }

    public void setBlackBorder() {
        System.out.println("+黑色边框");
    }
}
