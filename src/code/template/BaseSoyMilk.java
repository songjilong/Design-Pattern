package code.template;

/**
 * @author songjilong
 * @date 2020/4/23 14:48
 */
public abstract class BaseSoyMilk {
    /**
     * 模板方法，制作豆浆的流程
     * 声明为 final，防止子类重写
     */
    protected final void make() {
        select();
        if(isAdd()){
            addOther();
        }
        soak();
        grind();
    }

    private void select() {
        System.out.println("选择上好的黄豆");
    }

    protected abstract void addOther();

    private void soak() {
        System.out.println("浸泡原材料");
    }

    private void grind() {
        System.out.println("研磨成豆浆");
    }

    protected boolean isAdd(){
        return true;
    }
}
