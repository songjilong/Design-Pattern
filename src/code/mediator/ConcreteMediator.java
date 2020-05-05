package code.mediator;

/**
 * @author songjilong
 * @date 2020/5/5 18:41
 */
public class ConcreteMediator implements Mediator {
    private HouseOwner houseOwner;
    private Tenant tenant;

    @Override
    public void contact(Person person, String message) {
        if (person instanceof HouseOwner) {
            //如果是房主，则租客获得消息
            tenant.getMessage(message);
        } else if (person instanceof Tenant) {
            //如果是租客，则房主获得消息
            houseOwner.getMessage(message);
        }
    }

    public void setHouseOwner(HouseOwner houseOwner) {
        this.houseOwner = houseOwner;
    }

    public void setTenant(Tenant tenant) {
        this.tenant = tenant;
    }
}
