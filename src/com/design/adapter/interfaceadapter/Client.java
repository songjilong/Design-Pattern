package com.design.adapter.interfaceadapter;

import org.junit.Test;

/**
 * @author song
 * @create 2020/3/27 20:43
 */
public class Client {
    @Test
    public void test(){
        AbstractAdapter adapter = new AbstractAdapter() {
            @Override
            public void m1() {
                System.out.println("我要用m1方法");
            }
        };
        adapter.m1();
    }
}
