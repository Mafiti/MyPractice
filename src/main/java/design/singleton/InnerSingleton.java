package design.singleton;

/**
 * Created by TAO on 2018/8/7.
 */
public class InnerSingleton {

    private InnerSingleton(){}

    private static class SingletonHolder{
        private static final InnerSingleton innerSingleton = new InnerSingleton();
    }

    private static final InnerSingleton getInnerSingleton(){
        return  SingletonHolder.innerSingleton;
    }
}
