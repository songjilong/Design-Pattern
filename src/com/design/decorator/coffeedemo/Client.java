package com.design.decorator.coffeedemo;

import org.junit.Test;

/**
 * @author song
 * @create 2020/4/2 23:50
 */
public class Client {
    @Test
    public void test01(){
        SugarDecorator sugarLatteCoffee = new SugarDecorator(new LatteCoffee());
        System.out.println(sugarLatteCoffee.getDes());
        System.out.println("共$" + sugarLatteCoffee.cost());
        System.out.println("==================");
        MilkDecorator milkMochaCoffee = new MilkDecorator(new MochaCoffee());
        System.out.println(milkMochaCoffee.getDes());
        System.out.println("共$" + milkMochaCoffee.cost());
    }

    @Test
    public void test02(){
        Drink order = new MochaCoffee();
        System.out.println(order.getDes());
        System.out.println("共$" + order.cost());

        order = new MilkDecorator(order);
        System.out.println(order.getDes());
        System.out.println("共$" + order.cost());

        order = new MilkDecorator(order);
        System.out.println(order.getDes());
        System.out.println("共$" + order.cost());

        order = new SugarDecorator(order);
        System.out.println(order.getDes());
        System.out.println("共$" + order.cost());
    }
}
