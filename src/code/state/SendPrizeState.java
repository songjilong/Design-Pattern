package code.state;

/**
 * @author songjilong
 * @date 2020/5/15 12:07
 */
public class SendPrizeState implements State {

    private RaffleActivity activity;

    public SendPrizeState(RaffleActivity activity) {
        this.activity = activity;
    }

    @Override
    public void sendPrize() {
        int count = activity.getCount();
        //没有奖品了
        if (count <= 0) {
            System.out.println("奖品没有了，下次再来吧");
            activity.setState(activity.getNoPrizeState());
        } else {
            activity.setCount(--count);
            System.out.println("奖品已发送");
            activity.setState(activity.getNotRaffleState());
        }
    }
}
