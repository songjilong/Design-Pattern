package code.mediator;

/**
 * @author songjilong
 * @date 2020/5/5 18:39
 */
public interface Mediator {
    /**
     * 和同事类联系
     * @param person 发送者
     * @param message 传递的信息
     */
    void contact(Person person, String message);
}
