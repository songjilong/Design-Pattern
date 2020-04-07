package code.composite;

/**
 * @author song
 * @create 2020/4/7 12:16
 */
public abstract class OrganizationComponent {
    private String name;

    public OrganizationComponent(String name) {
        this.name = name;
    }

    protected void add(OrganizationComponent component) {
        throw new UnsupportedOperationException("不支持添加操作");
    }

    protected void remove(OrganizationComponent component) {
        throw new UnsupportedOperationException("不支持删除操作");
    }

    protected abstract void print();


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
