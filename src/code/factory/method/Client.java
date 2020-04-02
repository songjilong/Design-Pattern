package code.factory.method;

import code.factory.simple.Shape;

/**
 * @author song
 * @create 2020/3/20 10:49
 */
public class Client {
    public static void main(String[] args) {
        Shape circle = new CircleFactory().getShape();
        circle.draw();
        Shape square = new SquareFactory().getShape();
        square.draw();
    }
}
