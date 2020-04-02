package com.design.builder;

/**
 * @author song
 * @create 2020/3/19 17:19
 */
public class CommonHouse extends HouseBuilder {
    @Override
    public void buildBasic() {
        System.out.println("打10m的地基");
    }

    @Override
    public void buildWall() {
        System.out.println("砌20cm的墙");
    }

    @Override
    public void buildRoof() {
        System.out.println("封瓦片顶");
    }
}
