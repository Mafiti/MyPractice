package design.factory.simple;

/**
 * Created by TAO on 2018/8/7.
 */
public class SHNoodle implements Noodle {
    @Override
    public void produceNoodles() {
        System.out.println("这是上海的面条");
    }
}
