package code.interpreter;

/**
 * @author songjilong
 * @date 2020/5/11 21:13
 * 抽象解释器
 */
public abstract class AbstractExpression {
    public abstract int interpret(Context context);
}