package code.bridge;

import org.junit.Test;

/**
 * @author song
 * @create 2020/3/30 16:07
 */
public class Client {
    @Test
    public void test(){
        AbsPhone p1 = new FoldingPhone(new Nokia());
        p1.open();
        p1.close();
        System.out.println();
        AbsPhone p2 = new UpRightPhone(new Moto());
        p2.open();
        p2.close();
    }
}
