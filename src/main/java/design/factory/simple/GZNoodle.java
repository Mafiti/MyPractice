package design.factory.simple;

/**
 * Created by TAO on 2018/8/7.
 */
public class GZNoodle implements Noodle {

    @Override
    public void produceNoodles() {
        System.out.println("这是广州的面条");
    }
}
