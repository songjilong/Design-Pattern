package com.design.adapter.classandobjectadapter;

/**
 * @author song
 * @create 2020/3/27 17:55
 */
public class Phone {
    public static void charging(Voltage5V voltage5V){
        int v = voltage5V.output5V();
        if(v == 5){
            System.out.println("接收电压为5V，正常充电");
        }else if(v > 5){
            System.out.println("电压高于5V，无法充电");
        }
    }
}
