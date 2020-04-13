package code.facade;

/**
 * @author songjilong
 * @date 2020/4/13 21:58
 */
public class Memory {
    private static Memory instance = new Memory();

    private Memory() {
    }

    public static Memory getInstance() {
        return instance;
    }

    public void start() {
        System.out.println("内存启动");
    }

    public void stop() {
        System.out.println("内存停止工作");
    }
}
