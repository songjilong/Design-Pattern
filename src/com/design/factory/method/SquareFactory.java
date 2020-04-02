package com.design.factory.method;

import com.design.factory.simple.Shape;
import com.design.factory.simple.Square;

/**
 * @author song
 * @create 2020/3/20 10:47
 */
public class SquareFactory implements Factory {
    @Override
    public Shape getShape() {
        return new Square();
    }
}
