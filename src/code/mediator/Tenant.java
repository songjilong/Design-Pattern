package code.mediator;

/**
 * @author songjilong
 * @date 2020/5/5 18:42
 */
public class Tenant extends Person {

    public Tenant(String name, Mediator mediator) {
        super(name, mediator);
    }

    public void contact(String message) {
        this.mediator.contact(this, message);
    }

    public void getMessage(String message) {
        System.out.println(this.name + "（租客）获得信息：" + message);
    }
}
