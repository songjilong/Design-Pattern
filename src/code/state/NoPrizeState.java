package code.state;

/**
 * @author songjilong
 * @date 2020/5/15 12:08
 */
public class NoPrizeState implements State {

    private RaffleActivity activity;

    public NoPrizeState(RaffleActivity activity) {
        this.activity = activity;
    }

    @Override
    public void signUp() {
        System.out.println("奖品没有了，下次再来吧");
        System.exit(0);
    }

    @Override
    public boolean raffle() {
        System.out.println("奖品没有了，下次再来吧");
        System.exit(0);
        return false;
    }

    @Override
    public void sendPrize() {
        System.out.println("奖品没有了，下次再来吧");
        System.exit(0);
    }
}
