package com.design.factory.simple;

/**
 * @author song
 * @create 2020/3/20 10:10
 */
public class Client2 {
    public static void main(String[] args) {
        Circle circle = (Circle) ShapeFactory2.getClass(Circle.class);
        circle.draw();
        Square square = (Square) ShapeFactory2.getClass(Square.class);
        square.draw();
    }
}
