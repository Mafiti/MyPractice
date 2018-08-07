package design.factory.simple;

/**
 * Created by TAO on 2018/8/7.
 */
public class LZNoodle implements Noodle {
    @Override
    public void produceNoodles() {
        System.out.println("这是兰州的拉面");
    }
}
