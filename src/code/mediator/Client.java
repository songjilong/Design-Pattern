package code.mediator;

import org.junit.Test;

/**
 * @author songjilong
 * @date 2020/5/5 18:51
 */
public class Client {
    @Test
    public void test() {
        ConcreteMediator mediator = new ConcreteMediator();

        HouseOwner houseOwner = new HouseOwner("包租婆", mediator);
        Tenant tenant = new Tenant("小王", mediator);

        //中介需要知道房主和租客
        mediator.setHouseOwner(houseOwner);
        mediator.setTenant(tenant);

        //通过中介传递信息
        tenant.contact("你们这儿的房子不停水吧？");
        houseOwner.contact("不停，你就放心的租吧！");
    }
}
