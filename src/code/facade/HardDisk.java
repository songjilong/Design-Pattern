package code.facade;

/**
 * @author songjilong
 * @date 2020/4/13 21:59
 */
public class HardDisk {
    private static HardDisk instance = new HardDisk();

    private HardDisk() {
    }

    public static HardDisk getInstance() {
        return instance;
    }

    public void start() {
        System.out.println("硬盘启动");
    }

    public void stop() {
        System.out.println("硬盘停止工作");
    }
}
