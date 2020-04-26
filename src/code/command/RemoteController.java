package code.command;

/**
 * @author songjilong
 * @date 2020/4/25 22:57
 */
public class RemoteController {
    /**
     * 操作对象的个数
     */
    private static final int COUNT = 5;
    /**
     * 开启命令组
     */
    Command[] onCommands;
    /**
     * 关闭命令组
     */
    Command[] offCommands;
    /**
     * 执行撤销的命令
     */
    Command undoCommand;

    /**
     * 初始化
     */
    public RemoteController() {
        onCommands = new Command[COUNT];
        offCommands = new Command[COUNT];
        for (int i = 0; i < COUNT; i++) {
            onCommands[i] = new NullCommand();
            offCommands[i] = new NullCommand();
        }
    }

    /**
     * 设置按钮
     */
    public void setCommand(int no, Command onCommand, Command offCommand) {
        onCommands[no] = onCommand;
        offCommands[no] = offCommand;
    }

    /**
     * 按下开按钮
     */
    public void pressOnButton(int no) {
        onCommands[no].execute();
        //记录按钮，以便撤销
        undoCommand = onCommands[no];
    }

    /**
     * 按下关按钮
     */
    public void pressOffButton(int no) {
        offCommands[no].execute();
        //记录按钮，以便撤销
        undoCommand = offCommands[no];
    }

    /**
     * 按下撤销按钮
     */
    public void pressUndoButton(int no) {
        if (undoCommand != null) {
            undoCommand.undo();
        }
    }
}
