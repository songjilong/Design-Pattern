package code.visitor;

/**
 * @author songjilong
 * @date 2020/4/26 22:41
 */
public interface Element {
    /**
     * 接收一个抽象访问者访问
     */
    void accept(Visitor visitor);
}
