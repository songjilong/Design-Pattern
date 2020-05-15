package code.state;

/**
 * @author songjilong
 * @date 2020/5/15 11:55
 */
public class NotRaffleState implements State {

    private RaffleActivity activity;

    public NotRaffleState(RaffleActivity activity) {
        this.activity = activity;
    }

    @Override
    public void signUp() {
        //如果没有奖品，直接进入无奖品状态
        if (!activity.hasPrize()) {
            activity.setState(activity.getNoPrizeState());
            return;
        }
        System.out.println("报名成功，可以抽奖了");
        activity.setState(activity.getCanRaffleState());
    }
}
