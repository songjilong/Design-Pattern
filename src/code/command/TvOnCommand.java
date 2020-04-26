package code.command;

/**
 * @author songjilong
 * @date 2020/4/25 22:52
 */
public class TvOnCommand implements Command {
    private TvReceiver tvReceiver;

    public TvOnCommand(TvReceiver tvReceiver) {
        this.tvReceiver = tvReceiver;
    }

    @Override
    public void execute() {
        tvReceiver.on();
    }

    @Override
    public void undo() {
        tvReceiver.off();
    }
}
