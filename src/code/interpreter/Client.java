package code.interpreter;

import org.junit.Test;

/**
 * @author songjilong
 * @date 2020/5/11 21:13
 * 测试类
 */
public class Client {
    @Test
    public void test(){
        Context context = new Context();

        context.addValue("a", 6);
        context.addValue("b", 9);
        context.addValue("c", 1);

        Variable a = new Variable("a");
        Variable b = new Variable("b");
        Variable c = new Variable("c");

        AbstractExpression addValue = new AddExpression(a, b);
        AbstractExpression subValue = new SubExpression(addValue, c);

        System.out.println(context.getValueMap());
        System.out.println("a+b-c=" + subValue.interpret(context));
    }
}