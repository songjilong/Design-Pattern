package code.factory.method;

import code.factory.simple.Shape;
import code.factory.simple.Square;

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
