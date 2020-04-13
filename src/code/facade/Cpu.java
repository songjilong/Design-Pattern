package code.facade;

/**
 * @author songjilong
 * @date 2020/4/13 21:58
 */
public class Cpu {
    private static Cpu instance = new Cpu();

    private Cpu() {
    }

    public static Cpu getInstance() {
        return instance;
    }

    public void start() {
        System.out.println("CPU启动");
    }

    public void stop() {
        System.out.println("CPU停止工作");
    }
}
