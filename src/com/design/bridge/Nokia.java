package com.design.bridge;

/**
 * @author song
 * @create 2020/3/30 15:58
 */
public class Nokia implements PhoneBrand {
    @Override
    public void open() {
        System.out.println("诺基亚开机...");
    }

    @Override
    public void close() {
        System.out.println("诺基亚关机...");
    }
}
