package code.command;

/**
 * @author songjilong
 * @date 2020/4/25 22:58
 */
public class NullCommand implements Command {
    @Override
    public void execute() { }

    @Override
    public void undo() { }
}
