package code.chain;

/**
 * @author songjilong
 * @date 2020/5/19 13:56
 */
public abstract class Approver {
    protected String name;
    protected Approver approver;

    public Approver(String name) {
        this.name = name;
    }

    public void setApprover(Approver approver) {
        this.approver = approver;
    }

    /**
     * 处理请求
     * @param request
     */
    public abstract void processRequest(PurchaseRequest request);
}
