package code.facade;

import org.junit.Test;

/**
 * @author songjilong
 * @date 2020/4/13 22:12
 */
public class Client {
    Computer computer = new Computer();

    @Test
    public void boot(){
        computer.boot();
    }

    @Test
    public void shutdown(){
        computer.shutdown();
    }
}
