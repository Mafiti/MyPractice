package design.singleton;

/**
 * Created by TAO on 2018/8/7.
 */
public class HungrySingleton {

    private static HungrySingleton hungrySingleton = new HungrySingleton();

    private HungrySingleton(){}

    public static HungrySingleton getHungrySingleton(){
        return hungrySingleton;
    }
}
