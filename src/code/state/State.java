package code.state;

/**
 * @author songjilong
 * @date 2020/5/15 11:38
 * 抽象状态，将所有方法定义为默认实现，子类可以选择实现
 */
public interface State {
    RuntimeException EXCEPTION = new RuntimeException("不能执行此操作");

    /**
     * 报名
     */
    default void signUp() {
        throw EXCEPTION;
    }

    /**
     * 抽奖
     */
    default boolean raffle() {
        throw EXCEPTION;
    }

    /**
     * 发奖品
     */
    default void sendPrize() {
        throw EXCEPTION;
    }
}
