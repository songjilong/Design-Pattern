package code.visitor;

import org.junit.Test;

/**
 * @author songjilong
 * @date 2020/4/26 22:55
 */
public class Client {
    @Test
    public void test() {
        ObjectStructure objectStructure = new ObjectStructure();
        objectStructure.attach(new Student("Jack(student)", 95, 4));
        objectStructure.attach(new Student("Maria(student)", 85, 6));
        objectStructure.attach(new Teacher("Mike(teacher)", 80, 9));
        objectStructure.attach(new Teacher("Anna(teacher)", 85, 10));
        objectStructure.accept(new ScoreJudge());
        System.out.println("---------------------");
        objectStructure.accept(new ResearchJudge());
    }
}
