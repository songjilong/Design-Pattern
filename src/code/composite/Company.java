package code.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @author song
 * @create 2020/4/7 12:21
 */
public class Company extends OrganizationComponent {
    private List<OrganizationComponent> components = new ArrayList<>();

    public Company(String name) {
        super(name);
    }

    @Override
    protected void add(OrganizationComponent component) {
        components.add(component);
    }

    @Override
    protected void remove(OrganizationComponent component) {
        components.remove(component);
    }

    @Override
    protected void print() {
        System.out.println("======="+getName()+"=======");
        for (OrganizationComponent component : components) {
            component.print();
        }
    }

    @Override
    public String getName() {
        return super.getName();
    }
}
