package code.chain;

import org.junit.Test;

/**
 * @author songjilong
 * @date 2020/5/19 14:07
 */
public class Client {
    @Test
    public void test(){
        PurchaseRequest request = new PurchaseRequest(1, 5000);

        TeamLeader teamLeader = new TeamLeader("李组长");
        Manager manager = new Manager("张经理");
        Boss boss = new Boss("王老板");

        teamLeader.setApprover(manager);
        manager.setApprover(boss);
        boss.setApprover(teamLeader);

        manager.processRequest(request);
        boss.processRequest(request);
    }
}
