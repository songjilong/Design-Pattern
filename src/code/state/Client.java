package code.state;

import org.junit.Test;

/**
 * @author songjilong
 * @date 2020/5/15 12:29
 */
public class Client {
    @Test
    public void test(){
        RaffleActivity activity = new RaffleActivity(1);
        for (int i = 0; i < 5; i++) {
            System.out.println("第" + (i + 1) + "次抽奖");
            activity.signUp();
            activity.raffle();
            System.out.println("------------------");
        }
    }
}
