package com.design.decorator.coffeedemo;

/**
 * @author song
 * @create 2020/4/2 23:47
 */
public class SugarDecorator extends Decorator{
    public SugarDecorator(Drink drink) {
        super(drink);
        setDes("白糖");
        setPrice(1.0f);
    }
}
