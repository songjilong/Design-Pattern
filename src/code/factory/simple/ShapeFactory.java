package code.factory.simple;

/**
 * @author song
 * @create 2020/3/20 10:09
 */
public class ShapeFactory {
    public static Shape getShape(String name){
        if(name == null){
            return null;
        }
        if ("SQUARE".equalsIgnoreCase(name)){
            return new Square();
        }else if("CIRCLE".equalsIgnoreCase(name)){
            return new Circle();
        }else{
            return null;
        }
    }
}
