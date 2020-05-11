package code.interpreter;

/**
 * @author songjilong
 * @date 2020/5/11 21:13
 * 终结表达式：变量
 */
public class Variable extends AbstractExpression {
    private final String key;

    public Variable(String key) {
        this.key = key;
    }

    @Override
    public int interpret(Context context) {
        return context.getValue(key);
    }
}