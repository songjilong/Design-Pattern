package code.factory.simple;

/**
 * @author song
 * @create 2020/3/20 10:09
 */
public class ShapeFactory2 {
    public static Object getClass(Class<? extends Shape> clazz){
        if (clazz == null){
            return null;
        }
        try {
            return clazz.newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return null;
    }
}
