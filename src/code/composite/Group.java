package code.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @author song
 * @create 2020/4/7 12:21
 */
public class Group extends OrganizationComponent {
    public Group(String name) {
        super(name);
    }

    @Override
    protected void print() {
        System.out.println(getName());
    }

    @Override
    public String getName() {
        return super.getName();
    }
}
