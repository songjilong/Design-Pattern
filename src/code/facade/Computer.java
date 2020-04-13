package code.facade;

/**
 * @author songjilong
 * @date 2020/4/13 22:04
 */
public class Computer {
    private Cpu cpu;
    private Memory memory;
    private HardDisk hardDisk;

    public Computer() {
        this.cpu = Cpu.getInstance();
        this.memory = Memory.getInstance();
        this.hardDisk = HardDisk.getInstance();
    }

    /**
     * 开机
     */
    public void boot(){
        cpu.start();
        memory.start();
        hardDisk.start();
    }

    /**
     * 关机
     */
    public void shutdown(){
        cpu.stop();
        memory.stop();
        hardDisk.stop();
    }
}
