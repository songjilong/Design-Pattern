package com.design.bridge;

/**
 * @author song
 * @create 2020/3/30 16:04
 */
public class UpRightPhone extends AbsPhone{

    public UpRightPhone(PhoneBrand brand) {
        super(brand);
    }

    @Override
    protected void open() {
        System.out.print("直立式 - ");
        super.open();
    }

    @Override
    protected void close() {
        System.out.print("直立式 - ");
        super.close();
    }
}
