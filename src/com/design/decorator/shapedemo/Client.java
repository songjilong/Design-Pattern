package com.design.decorator.shapedemo;

import org.junit.Test;

/**
 * @author song
 * @create 2020/4/2 23:19
 */
public class Client {
    @Test
    public void test01() {
        RedDecorator redCircle = new RedDecorator(new Circle());
        redCircle.draw();

        BlackDecorator blackSquare = new BlackDecorator(new Square());
        blackSquare.draw();
    }
}
