package com.design.decorator.shapedemo;

/**
 * @author song
 * @create 2020/4/2 23:07
 * 这里的继承并不是为了继承父类的属性，而是统一类型
 */
public class RedDecorator extends Decorator {
    public RedDecorator(Shape shape) {
        super(shape);
    }

    @Override
    public void draw() {
        shape.draw();
        setRedBorder();
    }

    public void setRedBorder() {
        System.out.println("+红色边框");
    }
}
