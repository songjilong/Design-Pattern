package code.decorator.shapedemo;

/**
 * @author song
 * @create 2020/4/2 23:05
 */
public abstract class Decorator implements Shape {
    protected Shape shape;

    public Decorator(Shape shape) {
        this.shape = shape;
    }

    @Override
    public void draw() {
        shape.draw();
    }
}
