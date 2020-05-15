package code.state;

import java.util.Random;

/**
 * @author songjilong
 * @date 2020/5/15 12:02
 */
public class CanRaffleState implements State {

    private RaffleActivity activity;

    public CanRaffleState(RaffleActivity activity) {
        this.activity = activity;
    }

    @Override
    public boolean raffle() {
        //模拟五分之一的中奖几率
        int n = new Random().nextInt(5);
        if (n == 0) {
            //抽中，进入发放奖品的状态
            System.out.println("恭喜你，抽中了");
            activity.setState(activity.getSendPrizeState());
            return true;
        } else {
            //未抽中，回到初始状态
            System.out.println("很遗憾，没有抽中");
            activity.setState(activity.getNotRaffleState());
            return false;
        }
    }
}
