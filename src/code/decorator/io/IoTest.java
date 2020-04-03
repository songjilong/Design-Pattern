package code.decorator.io;

import org.junit.Test;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * @author song
 * @create 2020/4/3 15:39
 */
public class IoTest {
    @Test
    public void test01() throws IOException {
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(new File("G:\\a.txt")));
        byte[] temp = new byte[20];
        while (bis.read(temp, 0, temp.length) > 0){
            System.out.print(new String(temp));
        }
        bis.close();
    }
}
