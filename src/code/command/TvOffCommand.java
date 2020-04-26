package code.command;

/**
 * @author songjilong
 * @date 2020/4/25 22:52
 */
public class TvOffCommand implements Command {
    private TvReceiver tvReceiver;

    public TvOffCommand(TvReceiver tvReceiver) {
        this.tvReceiver = tvReceiver;
    }

    @Override
    public void execute() {
        tvReceiver.off();
    }

    @Override
    public void undo() {
        tvReceiver.on();
    }
}
