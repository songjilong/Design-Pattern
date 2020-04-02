package com.design.builder;

/**
 * @author song
 * @create 2020/3/19 17:19
 */
public class HighHouse extends HouseBuilder {
    @Override
    public void buildBasic() {
        System.out.println("打20m的地基");
    }

    @Override
    public void buildWall() {
        System.out.println("砌50cm的墙");
    }

    @Override
    public void buildRoof() {
        System.out.println("封玻璃顶");
    }
}
