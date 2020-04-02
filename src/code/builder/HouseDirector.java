package code.builder;

/**
 * @author song
 * @create 2020/3/19 17:21
 */
public class HouseDirector {

    private HouseBuilder builder;

    public HouseDirector(HouseBuilder builder) {
        this.builder = builder;
    }

    public House build(){
        builder.buildBasic();
        builder.buildWall();
        builder.buildRoof();
        return builder.buildHouse();
    }
}
