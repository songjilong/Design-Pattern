package code.factory.simple;

/**
 * @author song
 * @create 2020/3/20 10:10
 */
public class Client {
    public static void main(String[] args) {
        Shape circle = ShapeFactory.getShape("circle");
        circle.draw();
        Shape square = ShapeFactory.getShape("square");
        square.draw();
    }
}
