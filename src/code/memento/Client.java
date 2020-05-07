package code.memento;

import org.junit.Test;

/**
 * @author songjilong
 * @date 2020/5/7 23:20
 */
public class Client {
    @Test
    public void test() {
        //设置初始状态
        Originator originator = new Originator();
        originator.setState("状态1");
        System.out.println("初始状态：" + originator.getState());

        //创建管理者
        Caretaker caretaker = new Caretaker();
        caretaker.setMemento(originator.createMemento());

        //更新状态
        originator.setState("状态2");
        System.out.println("跟新状态：" + originator.getState());

        //恢复状态
        originator.restoreMemento(caretaker.getMemento());
        System.out.println("恢复状态：" + originator.getState());
    }
}
