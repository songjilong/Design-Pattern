package code.state;

/**
 * @author songjilong
 * @date 2020/5/15 11:56
 * 抽奖活动
 */
public class RaffleActivity {
    private State state;
    private int count;
    private State notRaffleState = new NotRaffleState(this);
    private State canRaffleState = new CanRaffleState(this);
    private State sendPrizeState = new SendPrizeState(this);
    private State noPrizeState = new NoPrizeState(this);

    public RaffleActivity(int count) {
        this.state = getNotRaffleState();
        this.count = count;
    }

    public void signUp() {
        state.signUp();
    }

    public void raffle() {
        if (state.raffle()) {
            state.sendPrize();
        }
    }

    public State getState() {
        return state;
    }

    public boolean hasPrize(){
        return count > 0;
    }

    public void setState(State state) {
        this.state = state;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public State getNotRaffleState() {
        return notRaffleState;
    }

    public void setNotRaffleState(State notRaffleState) {
        this.notRaffleState = notRaffleState;
    }

    public State getCanRaffleState() {
        return canRaffleState;
    }

    public void setCanRaffleState(State canRaffleState) {
        this.canRaffleState = canRaffleState;
    }

    public State getSendPrizeState() {
        return sendPrizeState;
    }

    public void setSendPrizeState(State sendPrizeState) {
        this.sendPrizeState = sendPrizeState;
    }

    public State getNoPrizeState() {
        return noPrizeState;
    }

    public void setNoPrizeState(State noPrizeState) {
        this.noPrizeState = noPrizeState;
    }
}
