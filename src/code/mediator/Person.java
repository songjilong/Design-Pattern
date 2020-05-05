package code.mediator;

/**
 * @author songjilong
 * @date 2020/5/5 18:39
 */
public abstract class Person {
    protected String name;
    protected Mediator mediator;

    public Person(String name, Mediator mediator) {
        this.name = name;
        this.mediator = mediator;
    }
}
