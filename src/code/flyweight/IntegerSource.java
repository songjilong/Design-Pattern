package code.flyweight;

/**
 * @author songjilong
 * @date 2020/4/14 14:02
 */
public class IntegerSource {
    public static void main(String[] args) {
        Integer v1 = 127;
        Integer v2 = 127;
        System.out.println("v1等于v2？ " + (v1 == v2)); //true
        Integer v3 = 128;
        Integer v4 = 128;
        System.out.println("v3等于v4？ " + (v3 == v4)); //false
    }
}
