package code.factory.abs;

/**
 * @author song
 * @create 2020/3/20 11:08
 */
public class AK47Factory implements ArmsFactory{

    @Override
    public Gun produceGun() {
        return new AK47();
    }

    @Override
    public Bullet produceBullet() {
        return new AK47Bullet();
    }
}
