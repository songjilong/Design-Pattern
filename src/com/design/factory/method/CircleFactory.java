package com.design.factory.method;

import com.design.factory.simple.Circle;
import com.design.factory.simple.Shape;

/**
 * @author song
 * @create 2020/3/20 10:47
 */
public class CircleFactory implements Factory {
    @Override
    public Shape getShape() {
        return new Circle();
    }
}
