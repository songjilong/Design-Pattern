package code.factory.abs;

/**
 * @author song
 * @create 2020/3/20 11:10
 */
public class Client {
    public static void main(String[] args) {
        ArmsFactory factory;

        factory = new AK47Factory();
        Gun ak47 = factory.produceGun();
        Bullet ak47Bullet = factory.produceBullet();
        ak47Bullet.loading();
        ak47.shooting();

        factory = new M16Factory();
        Gun m16 = factory.produceGun();
        Bullet m16Bullet = factory.produceBullet();
        m16Bullet.loading();
        m16.shooting();
    }
}
