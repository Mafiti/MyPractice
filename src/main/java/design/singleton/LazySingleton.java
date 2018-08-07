package design.singleton;

/**
 * Created by TAO on 2018/8/7.
 */
public class LazySingleton {

    private static LazySingleton lazySingleton;

    private LazySingleton(){
    }

    public static synchronized LazySingleton getLazySingleton(){
        if (lazySingleton == null){
            lazySingleton = new LazySingleton();
        }
        return lazySingleton;
    }

}
