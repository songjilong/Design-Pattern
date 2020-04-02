package code.builder;

/**
 * @author song
 * @create 2020/3/19 17:23
 */
public class Client {
    public static void main(String[] args) {
        HouseDirector builderDirector1 = new HouseDirector(new CommonHouse());
        builderDirector1.build();
        System.out.println("---------");
        HouseDirector builderDirector2 = new HouseDirector(new HighHouse());
        builderDirector2.build();
    }
}
