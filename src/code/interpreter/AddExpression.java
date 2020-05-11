package code.interpreter;

/**
 * @author songjilong
 * @date 2020/5/11 21:13
 * 非终结表达式：加法
 */
public class AddExpression extends AbstractExpression {
    private final AbstractExpression left;
    private final AbstractExpression right;

    public AddExpression(AbstractExpression left, AbstractExpression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public int interpret(Context context) {
        return left.interpret(context) + right.interpret(context);
    }
}