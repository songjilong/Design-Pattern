package code.chain;

/**
 * @author songjilong
 * @date 2020/5/19 14:00
 */
public class Boss extends Approver {

    public Boss(String name) {
        super(name);
    }

    @Override
    public void processRequest(PurchaseRequest request) {
        if (request.getPrice() > 10000) {
            System.out.println(name + "审批了" + request.getId() + "号请求，价格为" + request.getPrice());
        } else {
            approver.processRequest(request);
        }
    }
}
