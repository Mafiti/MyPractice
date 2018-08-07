package design.singleton;

/**
 * Created by TAO on 2018/8/7.
 */
public class DoubleCheckingLocked {

    private volatile static DoubleCheckingLocked doubleCheckingLocked;

    private DoubleCheckingLocked(){}

    public static DoubleCheckingLocked getDoubleCheckingLocked(){
        if (doubleCheckingLocked == null){
            synchronized (DoubleCheckingLocked.class){
                if (doubleCheckingLocked == null){
                    doubleCheckingLocked = new DoubleCheckingLocked();
                }
            }
        }
        return doubleCheckingLocked;
    }

}
