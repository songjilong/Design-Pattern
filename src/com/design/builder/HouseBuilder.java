package com.design.builder;

/**
 * @author song
 * @create 2020/3/19 17:15
 */
public abstract class HouseBuilder {
    protected House house = new House();

    public abstract void buildBasic();

    public abstract void buildWall();

    public abstract void buildRoof();

    public House buildHouse() {
        return house;
    }
}
