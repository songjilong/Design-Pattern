package code.command;

/**
 * @author songjilong
 * @date 2020/4/25 22:51
 */
public interface Command {
    /**
     * 执行命令
     */
    void execute();

    /**
     * 撤销命令
     */
    void undo();
}
